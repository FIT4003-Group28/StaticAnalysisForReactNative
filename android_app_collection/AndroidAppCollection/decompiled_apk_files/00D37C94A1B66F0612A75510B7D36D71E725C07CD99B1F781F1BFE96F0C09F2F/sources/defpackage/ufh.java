package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ufh  reason: default package */
/* loaded from: classes4.dex */
public final class ufh implements ufe {
    public final uff a;
    private final uee b;
    private final ufi c;
    private final ufj d;

    public ufh(uee ueeVar, uff uffVar, ufi ufiVar, ufj ufjVar) {
        this.b = ueeVar;
        this.a = uffVar;
        this.c = ufiVar;
        this.d = ufjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0110 A[Catch: ExecutionException -> 0x0149, TimeoutException -> 0x014b, InterruptedException -> 0x0153, TryCatch #5 {InterruptedException -> 0x0153, ExecutionException -> 0x0149, TimeoutException -> 0x014b, blocks: (B:33:0x00d4, B:35:0x0110, B:39:0x011b, B:41:0x011f, B:43:0x0131, B:47:0x0139), top: B:64:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ufe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final defpackage.ucp r20, final java.util.List r21, final defpackage.ubz r22, final defpackage.uer r23, final boolean r24) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufh.a(ucp, java.util.List, ubz, uer, boolean):void");
    }

    @Override // defpackage.ufe
    public final void b(ueb uebVar) {
        ufj ufjVar = this.d;
        if (uebVar.j().isEmpty()) {
            return;
        }
        if (uebVar.d() == uec.SYSTEM_TRAY) {
            if (((Map) ufjVar.c.get()).containsKey(Integer.valueOf(uebVar.a()))) {
                ((uhg) ((Map) ufjVar.c.get()).get(Integer.valueOf(uebVar.a()))).a(uebVar);
            } else {
                uev.a("SystemTrayUserEventHelper", "No handler installed for system tray events of type %s", Integer.valueOf(uebVar.a()));
            }
        }
        ArrayList arrayList = new ArrayList(uebVar.j().size());
        for (int i = 0; i < uebVar.j().size(); i++) {
            arrayList.add(((ucw) uebVar.j().get(i)).a);
        }
        ufjVar.b.b(uebVar.c(), arrayList, uebVar.h(), uebVar.d(), uebVar.f());
        if (uebVar.d() == uec.SERVER || aomr.a.equals(uebVar.h())) {
            return;
        }
        if (uebVar.c() != null) {
            ufjVar.d.a.b(uebVar.c(), uebVar.h(), uebVar.i(), uebVar.d(), ucw.a(uebVar.j()));
            return;
        }
        for (ucw ucwVar : uebVar.j()) {
            if (!TextUtils.isEmpty(ucwVar.i)) {
                ufjVar.a.i(ucwVar.i, uebVar.h());
            }
        }
    }
}
