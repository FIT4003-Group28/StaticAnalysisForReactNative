package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mho  reason: default package */
/* loaded from: classes3.dex */
public final class mho {
    public final UploadArrowView a;
    public ilz b;
    public final imq c;

    public mho(imq imqVar, View view) {
        this.c = imqVar;
        this.a = (UploadArrowView) view.findViewById(R.id.upload_arrow);
    }

    public final void a() {
        ilz ilzVar = this.b;
        if (ilzVar != null) {
            ilzVar.b(false);
        }
        this.b = null;
        zag.o(this.a, false);
    }
}
