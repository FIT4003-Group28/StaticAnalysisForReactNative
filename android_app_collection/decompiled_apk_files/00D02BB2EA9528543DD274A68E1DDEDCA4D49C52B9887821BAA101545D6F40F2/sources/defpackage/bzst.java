package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bzst  reason: default package */
/* loaded from: classes4.dex */
public final class bzst implements bztn {
    private static bztm k(String str, Iterable<bztm> iterable) {
        dbsk.b(!dcft.w(iterable), "Input must contain at least one filter");
        Iterator<bztm> it = iterable.iterator();
        bztm next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        String join = TextUtils.join(sb.toString(), dcft.o(iterable, bzss.a));
        StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
        sb2.append("(");
        sb2.append(join);
        sb2.append(")");
        return new bzrv(sb2.toString());
    }

    @Override // defpackage.bztn
    public final bztm a(eapr eaprVar) {
        String valueOf = String.valueOf(String.valueOf(eaprVar.Tf()));
        return new bzrv(valueOf.length() != 0 ? "timestamp >= ".concat(valueOf) : new String("timestamp >= "));
    }

    @Override // defpackage.bztn
    public final bztm b(eapr eaprVar) {
        String valueOf = String.valueOf(String.valueOf(((eapd) eaprVar).a));
        return new bzrv(valueOf.length() != 0 ? "timestamp <= ".concat(valueOf) : new String("timestamp <= "));
    }

    @Override // defpackage.bztn
    public final bztm c(eaps eapsVar) {
        bztm a = a(eapsVar.e());
        String valueOf = String.valueOf(String.valueOf(eapsVar.g().a));
        return e(a, new bzrv(valueOf.length() != 0 ? "timestamp < ".concat(valueOf) : new String("timestamp < ")), new bztm[0]);
    }

    @Override // defpackage.bztn
    public final bztm d(Iterable<bztm> iterable) {
        return k("OR", iterable);
    }

    @Override // defpackage.bztn
    public final bztm e(bztm bztmVar, bztm bztmVar2, bztm... bztmVarArr) {
        return k("AND", dcbg.j(bztmVar, bztmVar2).n(bztmVarArr));
    }

    @Override // defpackage.bztn
    public final bztm f() {
        return bzsu.b("is_face_detected", false);
    }

    @Override // defpackage.bztn
    public final bztm g() {
        return bzsu.b("valid_photo_taken_notification_photo", true);
    }

    @Override // defpackage.bztn
    public final bztm h() {
        return bzsu.b("was_dismissed_in_todo_list", false);
    }

    @Override // defpackage.bztn
    public final bztm i() {
        return bzsu.b("was_shown_in_photo_taken_notification", false);
    }

    @Override // defpackage.bztn
    public final bztm j() {
        return bzsu.b("was_uploaded", false);
    }
}
