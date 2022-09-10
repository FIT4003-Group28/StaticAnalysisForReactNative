package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gl  reason: default package */
/* loaded from: classes.dex */
public final class gl implements gk {
    final String a;
    final int b;
    final int c;
    final /* synthetic */ gn d;

    public gl(gn gnVar, String str, int i, int i2) {
        this.d = gnVar;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.gk
    public final boolean j(ArrayList<ep> arrayList, ArrayList<Boolean> arrayList2) {
        fd fdVar = this.d.n;
        if (fdVar == null || this.b >= 0 || this.a != null || !fdVar.R().f()) {
            return this.d.M(arrayList, arrayList2, this.a, this.b, this.c);
        }
        return false;
    }
}
