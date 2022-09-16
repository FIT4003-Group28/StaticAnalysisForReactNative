package defpackage;

import java.util.Calendar;
import java.util.Date;
/* compiled from: PG */
/* renamed from: andf  reason: default package */
/* loaded from: classes.dex */
public final class andf extends andg {
    private final ande c;

    public andf(anbb anbbVar, int i, ande andeVar) {
        super(anbbVar, i);
        this.c = andeVar;
        StringBuilder sb = new StringBuilder("%");
        anbbVar.f(sb);
        sb.append(true != anbbVar.d() ? 't' : 'T');
        sb.append(andeVar.G);
    }

    @Override // defpackage.andg
    public final void a(andh andhVar, Object obj) {
        ande andeVar = this.c;
        anbb anbbVar = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            anbbVar.f(sb);
            sb.append(true != anbbVar.d() ? 't' : 'T');
            sb.append(andeVar.G);
            ((andl) andhVar).d.append(String.format(anbh.a, sb.toString(), obj));
            return;
        }
        StringBuilder sb2 = ((andl) andhVar).d;
        char c = andeVar.G;
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("%t");
        sb3.append(c);
        andl.d(sb2, obj, sb3.toString());
    }
}
