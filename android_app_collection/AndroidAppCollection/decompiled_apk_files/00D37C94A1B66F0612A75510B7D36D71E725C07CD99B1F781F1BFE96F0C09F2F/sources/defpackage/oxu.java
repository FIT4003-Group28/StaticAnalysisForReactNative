package defpackage;

import java.io.EOFException;
/* compiled from: PG */
/* renamed from: oxu  reason: default package */
/* loaded from: classes4.dex */
final class oxu {
    public oxq a;
    private final oxq[] b;
    private final oxr c;

    public oxu(oxq[] oxqVarArr, oxr oxrVar) {
        this.b = oxqVarArr;
        this.c = oxrVar;
    }

    public final oxq a(oxn oxnVar) {
        oxq oxqVar = this.a;
        if (oxqVar != null) {
            return oxqVar;
        }
        oxq[] oxqVarArr = this.b;
        int length = oxqVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            oxq oxqVar2 = oxqVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                oxnVar.i();
                throw th;
            }
            if (oxqVar2.f(oxnVar)) {
                this.a = oxqVar2;
                oxnVar.i();
                break;
            }
            continue;
            oxnVar.i();
            i++;
        }
        oxq oxqVar3 = this.a;
        if (oxqVar3 == null) {
            throw new oxw(this.b);
        }
        oxqVar3.a(this.c);
        return this.a;
    }
}
