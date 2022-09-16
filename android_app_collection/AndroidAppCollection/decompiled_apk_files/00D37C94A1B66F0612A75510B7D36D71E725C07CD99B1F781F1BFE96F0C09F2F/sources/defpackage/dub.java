package defpackage;
/* compiled from: PG */
/* renamed from: dub  reason: default package */
/* loaded from: classes3.dex */
public final class dub extends dux {
    public dub(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "Ut7bAnWbIKSJo3XjoHA4PLqBXjxAIstAab08ID6ImN/vaF9+yMgTBQsosjdDWqwk", "9Odb6fOMcFNJXWQmNVSn0GmBQ9RZp5IhG0YN3lGyJLg=", aopaVar, i, 5);
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.b |= 16;
        dnwVar.h = -1L;
        aopa aopaVar2 = this.g;
        aopaVar2.copyOnWrite();
        dnw dnwVar3 = (dnw) aopaVar2.instance;
        dnwVar3.b |= 32;
        dnwVar3.i = -1L;
        int[] iArr = (int[]) this.d.invoke(null, this.a.a);
        synchronized (this.g) {
            aopa aopaVar3 = this.g;
            aopaVar3.copyOnWrite();
            dnw dnwVar4 = (dnw) aopaVar3.instance;
            dnwVar4.b |= 16;
            dnwVar4.h = iArr[0];
            aopa aopaVar4 = this.g;
            long j = iArr[1];
            aopaVar4.copyOnWrite();
            dnw dnwVar5 = (dnw) aopaVar4.instance;
            dnwVar5.b |= 32;
            dnwVar5.i = j;
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                aopa aopaVar5 = this.g;
                long j2 = i;
                aopaVar5.copyOnWrite();
                dnw dnwVar6 = (dnw) aopaVar5.instance;
                dnwVar6.c |= 2097152;
                dnwVar6.S = j2;
            }
        }
    }
}
