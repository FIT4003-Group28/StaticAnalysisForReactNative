package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fwj  reason: default package */
/* loaded from: classes3.dex */
public final class fwj implements aafl {
    public final HatsController a;
    private final Context b;
    private final fwk c;

    public fwj(Context context, HatsController hatsController, fwk fwkVar) {
        this.b = context;
        this.a = hatsController;
        this.c = fwkVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arag aragVar;
        ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand = (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand) apzgVar.qm(ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.showSystemInfoDialogCommand);
        final avdu avduVar = (avdu) zew.K(map, "ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", avdu.class);
        if (avduVar == null) {
            return;
        }
        this.a.i(avduVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        if ((showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.b & 1) != 0) {
            aragVar = showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        AlertDialog.Builder title = builder.setTitle(ajgl.b(aragVar));
        fwk fwkVar = this.c;
        title.setMessage(new SpannableStringBuilder().append(fwkVar.a(R.string.hats_free_text_system_info_overview)).append(fwkVar.b(R.string.hats_free_text_installed_by_section_header)).append(fwkVar.a(R.string.hats_free_text_installed_by_section_contents)).append(fwkVar.b(R.string.hats_free_text_system_section_header)).append(fwkVar.a(R.string.hats_free_text_system_section_contents)).append(fwkVar.b(R.string.hats_free_text_network_section_header)).append(fwkVar.a(R.string.hats_free_text_network_section_contents))).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: fwi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                fwj fwjVar = fwj.this;
                fwjVar.a.l(avduVar, true);
            }
        }).create().show();
    }
}
