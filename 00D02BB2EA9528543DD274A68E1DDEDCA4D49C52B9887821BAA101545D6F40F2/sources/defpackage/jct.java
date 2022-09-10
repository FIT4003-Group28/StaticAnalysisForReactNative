package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: jct  reason: default package */
/* loaded from: classes7.dex */
final class jct implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ jcu d;

    public jct(jcu jcuVar, Uri uri, int i, int i2) {
        this.d = jcuVar;
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jcx jcxVar;
        jcu jcuVar = this.d;
        Uri uri = this.a;
        jcx[] jcxVarArr = jcuVar.e;
        int length = jcxVarArr.length;
        int i = 0;
        while (true) {
            if (i >= 2) {
                jcxVar = null;
                break;
            }
            jcxVar = jcxVarArr[i];
            if (jcxVar.a(uri)) {
                break;
            }
            i++;
        }
        jcx jcxVar2 = jcxVar;
        if (jcxVar2 == null) {
            this.d.a.execute(new Runnable(this) { // from class: jcq
                private final jct a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.widget.ImageView*/.setImageDrawable(null);
                }
            });
        } else {
            jcxVar2.b(this.d.getContext(), this.a, this.b, this.c, new jcr(this));
        }
    }
}
