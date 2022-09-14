package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdbh  reason: default package */
/* loaded from: classes3.dex */
public class bdbh implements bczx {
    private final gfw a;
    private final dwfl b;
    private final bbtw c;
    private final String d;

    public bdbh(Activity activity, bcaz bcazVar, gfw gfwVar, dwfl dwflVar, bbtw bbtwVar) {
        this.a = gfwVar;
        this.b = dwflVar;
        this.c = bbtwVar;
        this.d = activity.getResources().getString(R.string.EDIT_PHOTO_CAPTION_HINT);
    }

    @Override // defpackage.bczx
    public cqkl a() {
        this.a.aZ(bcaz.a(this.c, this.b, this.d));
        return cqkl.a;
    }

    @Override // defpackage.bczy
    public String b() {
        return this.b.g.isEmpty() ? this.d : this.b.g;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcva(cknv.j(this.b)), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.b;
    }
}
