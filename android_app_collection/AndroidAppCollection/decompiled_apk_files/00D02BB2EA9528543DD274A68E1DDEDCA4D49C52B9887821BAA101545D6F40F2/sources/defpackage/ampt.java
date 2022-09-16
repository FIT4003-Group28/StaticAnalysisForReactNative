package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ampt  reason: default package */
/* loaded from: classes.dex */
public final class ampt extends ampv {
    @dzsi
    public final altv a;

    public ampt(alwy alwyVar, int i, @dzsi altv altvVar) {
        super(alwyVar, i);
        this.a = altvVar;
    }

    @Override // defpackage.ampv
    public final boolean equals(@dzsi Object obj) {
        ampt amptVar;
        return (obj instanceof ampt) && (amptVar = (ampt) obj) != null && dbsd.a(this.b, amptVar.b) && dbsd.a(this.a, amptVar.a);
    }

    @Override // defpackage.ampv
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
