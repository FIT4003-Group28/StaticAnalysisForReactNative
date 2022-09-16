package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amms  reason: default package */
/* loaded from: classes2.dex */
public final class amms implements ammr {
    public final amme a;
    public final amlp[] b;
    private final alwo[] c;
    private final List<List<amlp>> d;

    public amms(amme ammeVar, alwo[] alwoVarArr) {
        this.a = ammeVar;
        this.c = alwoVarArr;
        int i = 0;
        for (alwo alwoVar : alwoVarArr) {
            i += alwoVar.d.length;
        }
        this.b = new amlp[i];
        this.d = new ArrayList(alwoVarArr.length);
        int i2 = 0;
        for (alwo alwoVar2 : alwoVarArr) {
            this.d.add(dchl.a());
            for (akrk akrkVar : alwoVar2.d) {
                this.b[i2] = new amlp(akrkVar);
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    @Override // defpackage.ammr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.akzh r31, defpackage.amlw r32) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amms.a(akzh, amlw):void");
    }
}
