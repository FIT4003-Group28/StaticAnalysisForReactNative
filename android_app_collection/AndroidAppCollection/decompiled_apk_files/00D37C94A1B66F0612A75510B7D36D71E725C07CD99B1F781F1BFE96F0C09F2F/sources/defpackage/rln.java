package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: rln  reason: default package */
/* loaded from: classes4.dex */
public final class rln {
    final /* synthetic */ rlp a;

    public rln(rlp rlpVar) {
        this.a = rlpVar;
    }

    public final void a(int i, String str, List list, boolean z, boolean z2) {
        rkq rkqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            rkqVar = this.a.aG().j;
        } else if (i2 != 1) {
            if (i2 == 3) {
                rkqVar = this.a.aG().k;
            } else if (i2 != 4) {
                rkqVar = this.a.aG().i;
            } else if (z) {
                rkqVar = this.a.aG().g;
            } else if (!z2) {
                rkqVar = this.a.aG().h;
            } else {
                rkqVar = this.a.aG().f;
            }
        } else if (z) {
            rkqVar = this.a.aG().d;
        } else if (!z2) {
            rkqVar = this.a.aG().e;
        } else {
            rkqVar = this.a.aG().c;
        }
        int size = list.size();
        if (size == 1) {
            rkqVar.b(str, list.get(0));
        } else if (size == 2) {
            rkqVar.c(str, list.get(0), list.get(1));
        } else if (size == 3) {
            rkqVar.d(str, list.get(0), list.get(1), list.get(2));
        } else {
            rkqVar.a(str);
        }
    }
}
