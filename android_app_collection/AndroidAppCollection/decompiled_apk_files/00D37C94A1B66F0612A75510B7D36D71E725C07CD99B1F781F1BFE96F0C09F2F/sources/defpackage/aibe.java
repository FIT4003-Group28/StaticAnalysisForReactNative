package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aibe  reason: default package */
/* loaded from: classes.dex */
public final class aibe {
    private final Context a;
    private Dialog b;

    public aibe(Context context) {
        this.a = context;
    }

    public final void a() {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            this.b.dismiss();
        }
        this.b = null;
    }

    public final void b(List list, aibf aibfVar) {
        c(list, aibfVar, null);
    }

    public final void c(List list, aibf aibfVar, acth acthVar) {
        InteractionLoggingScreen c;
        String string = this.a.getString(R.string.subtitles);
        aibfVar.getClass();
        a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.a, 17367057, list);
        AlertDialog create = new AlertDialog.Builder(this.a).setTitle(string).setSingleChoiceItems(arrayAdapter, 0, new aibd(arrayAdapter, aibfVar)).create();
        this.b = create;
        create.show();
        if (acthVar == null || (c = acthVar.oi().c()) == null) {
            return;
        }
        acum acumVar = new acum(c, actj.CAPTIONS_QUICK_MENU);
        acthVar.oi().D(acumVar);
        acthVar.oi().u(acumVar, null);
    }
}
