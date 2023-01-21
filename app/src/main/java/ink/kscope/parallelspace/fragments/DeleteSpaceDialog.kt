/*
 * Copyright (C) 2022 Project Kaleidoscope
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ink.kscope.parallelspace.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import ink.kscope.parallelspace.MainActivity
import ink.kscope.parallelspace.R

/**
 * Show the confirm dialog before removing a space.
 */

class DeleteSpaceDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle(getString(R.string.remove_space_dialog_title))
            .setMessage(getString(R.string.remove_space_dialog_message))
            .setPositiveButton(android.R.string.ok) { _, _ ->
                (activity as MainActivity).removeSpace()
            }
            .setNegativeButton(android.R.string.cancel, null)
            .create()
    }

    companion object {
        @JvmStatic
        fun newInstance() = DeleteSpaceDialog()
    }
}
