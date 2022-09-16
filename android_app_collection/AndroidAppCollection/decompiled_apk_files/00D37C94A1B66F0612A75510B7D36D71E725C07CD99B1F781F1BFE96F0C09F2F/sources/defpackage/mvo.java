package defpackage;

import android.text.Spanned;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: mvo  reason: default package */
/* loaded from: classes3.dex */
public final class mvo {
    public final mww a;
    public final ViewStub b;
    public final mvn c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public apzg h;
    public apzg i;

    public mvo(mww mwwVar, ViewStub viewStub, mvn mvnVar) {
        mwwVar.getClass();
        this.a = mwwVar;
        mvnVar.getClass();
        this.c = mvnVar;
        this.b = viewStub;
    }

    public static final Spanned a(apoj apojVar) {
        arag aragVar = null;
        if (apojVar != null) {
            if ((apojVar.b & 256) != 0 && (aragVar = apojVar.i) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        return null;
    }
}
