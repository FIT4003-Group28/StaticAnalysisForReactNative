package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afxu  reason: default package */
/* loaded from: classes.dex */
public final class afxu implements afyf {
    private final yqw a;
    private final aftj b;

    public afxu(yqw yqwVar, aftj aftjVar) {
        this.b = aftjVar;
        this.a = yqwVar;
    }

    @Override // defpackage.afyf
    public final void a(Object obj, final yiw yiwVar) {
        try {
            final Uri uri = (Uri) obj;
            this.a.a(new afti(this.b, uri.toString(), new cez() { // from class: afth
                @Override // defpackage.cez
                public final void kV(cff cffVar) {
                    yiw.this.a(uri, cffVar);
                }
            }, yiwVar, uri));
        } catch (zhy e) {
            yiwVar.a(obj, e);
        }
    }
}
