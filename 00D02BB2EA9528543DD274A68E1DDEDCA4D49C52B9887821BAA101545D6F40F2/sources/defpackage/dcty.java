package defpackage;

import java.util.Calendar;
import java.util.Date;
/* compiled from: PG */
/* renamed from: dcty  reason: default package */
/* loaded from: classes5.dex */
public final class dcty extends dctz {
    private final dctx c;

    public dcty(dcrg dcrgVar, int i, dctx dctxVar) {
        super(dcrgVar, i);
        this.c = dctxVar;
        StringBuilder sb = new StringBuilder("%");
        dcrgVar.f(sb);
        sb.append(true != dcrgVar.e() ? 't' : 'T');
        sb.append(dctxVar.G);
        sb.toString();
    }

    @Override // defpackage.dctz
    public final void a(dcua dcuaVar, Object obj) {
        dctx dctxVar = this.c;
        dcrg dcrgVar = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            dcrgVar.f(sb);
            sb.append(true != dcrgVar.e() ? 't' : 'T');
            sb.append(dctxVar.G);
            ((dcre) dcuaVar).b.append(String.format(dcrn.a, sb.toString(), obj));
            return;
        }
        StringBuilder sb2 = ((dcre) dcuaVar).b;
        char c = dctxVar.G;
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("%t");
        sb3.append(c);
        dcre.b(sb2, obj, sb3.toString());
    }
}
