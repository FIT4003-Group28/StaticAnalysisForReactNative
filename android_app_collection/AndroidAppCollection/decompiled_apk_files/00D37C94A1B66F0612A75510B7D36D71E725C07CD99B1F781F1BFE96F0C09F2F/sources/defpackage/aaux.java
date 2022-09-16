package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aaux  reason: default package */
/* loaded from: classes.dex */
public final class aaux {
    public final avnq a;
    public List b;

    public aaux(avnq avnqVar) {
        avnqVar.getClass();
        this.a = avnqVar;
    }

    public final avnd a() {
        avne avneVar = this.a.c;
        if (avneVar == null) {
            avneVar = avne.a;
        }
        if ((avneVar.b & 1) != 0) {
            avne avneVar2 = this.a.c;
            if (avneVar2 == null) {
                avneVar2 = avne.a;
            }
            avnd avndVar = avneVar2.c;
            return avndVar == null ? avnd.a : avndVar;
        }
        return null;
    }

    public final void b() {
        avnq avnqVar = this.a;
        if ((avnqVar.b & 128) != 0) {
            avmt avmtVar = avnqVar.f;
            if (avmtVar == null) {
                avmtVar = avmt.a;
            }
            if (avmtVar.b != null) {
                return;
            }
            aqft aqftVar = aqft.a;
        }
    }
}
