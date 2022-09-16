package defpackage;

import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afcg  reason: default package */
/* loaded from: classes.dex */
public final class afcg extends prz {
    public final afcj o;
    public final int p;

    public afcg(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, prt prtVar, afcj afcjVar, int i3) {
        super(asvVar, asyVar, format, i, obj, j, j2, j3, j4, j5, i2, j6, prtVar);
        this.o = afcjVar;
        this.p = i3;
    }

    @Override // defpackage.prz
    protected final prv g(final prr prrVar) {
        return new prv() { // from class: afcf
            @Override // defpackage.prv
            public final bab a(int i, int i2) {
                afcg afcgVar = afcg.this;
                return new afch(prrVar.a(i, i2), afcgVar.o, afcgVar.p);
            }
        };
    }
}
