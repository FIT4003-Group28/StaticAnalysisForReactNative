package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: kbq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kbq implements zas {
    public final /* synthetic */ kbu a;
    private final /* synthetic */ int b;

    public /* synthetic */ kbq(kbu kbuVar) {
        this.a = kbuVar;
    }

    public /* synthetic */ kbq(kbu kbuVar, int i) {
        this.b = i;
        this.a = kbuVar;
    }

    @Override // defpackage.zas
    public final void nH(int i, yye yyeVar) {
        if (this.b != 0) {
            kbu kbuVar = this.a;
            if (i != 0 || kbuVar.a != null) {
                return;
            }
            ((TextView) kbuVar.e.b).setText((CharSequence) null);
            return;
        }
        kbu kbuVar2 = this.a;
        if (i != 0 || kbuVar2.b != null) {
            return;
        }
        ((TextView) kbuVar2.f.b).setText((CharSequence) null);
    }
}
