package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdck  reason: default package */
/* loaded from: classes3.dex */
public class bdck implements bdaf {
    private final bcrt a;
    private final dwfl b;
    private final int c;
    @dzsi
    private final View.OnClickListener d;
    private final String e;

    public bdck(bcrt bcrtVar, dwfl dwflVar, int i, @dzsi View.OnClickListener onClickListener, String str) {
        this.a = bcrtVar;
        this.b = dwflVar;
        this.c = i;
        this.d = onClickListener;
        this.e = str;
    }

    @Override // defpackage.bdaf
    @dzsi
    public bdax a() {
        dqjc dqjcVar = this.b.s;
        if (dqjcVar == null) {
            dqjcVar = dqjc.d;
        }
        if ((dqjcVar.a & 1) != 0) {
            return this.a.a(this.b, this.c);
        }
        return null;
    }

    @Override // defpackage.bdaf
    public String b() {
        return this.e;
    }

    @Override // defpackage.bdaf
    @dzsi
    public View.OnClickListener c() {
        return this.d;
    }
}
