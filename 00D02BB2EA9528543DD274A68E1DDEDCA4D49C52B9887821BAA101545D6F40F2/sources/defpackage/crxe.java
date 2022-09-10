package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crxe  reason: default package */
/* loaded from: classes5.dex */
public final class crxe extends crxh<crts> {
    private final List<crts> k;

    public crxe(crxg crxgVar, List<crts> list) {
        super(dtbh.IMPORT, crxgVar);
        this.k = list;
        this.g.n(list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.crxh
    public final crtt a() {
        crtt a = super.a();
        crts crtsVar = this.k.get(0);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar = (crua) a.b;
        crua cruaVar2 = crua.o;
        crtsVar.getClass();
        cruaVar.d = crtsVar;
        cruaVar.a |= 4;
        return a;
    }

    @Override // defpackage.crxh, defpackage.crxl
    public final /* bridge */ /* synthetic */ Object b() {
        return this.k.get(0);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof crxe)) {
            return false;
        }
        return this.k.equals(((crxe) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022c, code lost:
        if (r14 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022e, code lost:
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0236, code lost:
        if (r0.hasNext() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0238, code lost:
        r3 = (defpackage.davp) r0.next();
        r5 = defpackage.crtv.e.bZ();
        r6 = defpackage.crtx.FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x024a, code lost:
        if (r5.c == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024c, code lost:
        r5.bF();
        r5.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0252, code lost:
        r7 = (defpackage.crtv) r5.b;
        r7.b = r6.l;
        r6 = r7.a | 1;
        r7.a = r6;
        r3 = r3.id;
        r3.getClass();
        r7.a = r6 | 2;
        r7.c = r3;
        r8.add(r5.bK());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0275, code lost:
        r9 = r9 + 10;
        r5 = r16;
        r6 = r17;
        r7 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxe.run():void");
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String a = this.a.a();
        int size = this.k.size();
        String valueOf = String.valueOf(this.a.b());
        String valueOf2 = String.valueOf(this.k);
        int length = String.valueOf(simpleName).length();
        int length2 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(simpleName);
        sb.append("[RequestId: ");
        sb.append(a);
        sb.append(", ");
        sb.append(size);
        sb.append(" photos, RequestData: ");
        sb.append(valueOf);
        sb.append(", Photos: ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
