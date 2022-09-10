package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: czpi  reason: default package */
/* loaded from: classes.dex */
public abstract class czpi extends fd {
    protected dubq a;
    protected dtzt b;
    protected Integer c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle d(dubq dubqVar, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", dubqVar.bS());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ff e() {
        ff J = J();
        if (J == null || J.isFinishing() || J.isDestroyed()) {
            return null;
        }
        return J;
    }

    public abstract void f();

    public abstract duaq g();

    public abstract void h(String str);

    public void i() {
    }

    @Override // defpackage.fd
    public void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        byte[] byteArray = bundle2.getByteArray("Question");
        if (byteArray != null) {
            this.a = (dubq) czph.a(dubq.i, byteArray);
        }
        this.c = bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null;
        bundle2.getInt("QuestionIndex");
        byte[] byteArray2 = bundle2.getByteArray("Completion");
        if (byteArray2 != null) {
            this.b = (dtzt) czph.a(dtzt.f, byteArray2);
        }
    }
}
