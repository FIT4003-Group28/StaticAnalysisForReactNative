package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ambx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ambx implements Callable {
    public final /* synthetic */ ankt a;
    public final /* synthetic */ ankt b;
    private final /* synthetic */ int c;

    public /* synthetic */ ambx(ankt anktVar, ankt anktVar2) {
        this.a = anktVar;
        this.b = anktVar2;
    }

    public /* synthetic */ ambx(ankt anktVar, ankt anktVar2, int i) {
        this.c = i;
        this.a = anktVar;
        this.b = anktVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c == 0) {
            ankt anktVar = this.a;
            ankt anktVar2 = this.b;
            amcm amcmVar = (amcm) anlz.y(anktVar);
            return (1 & amcmVar.b) != 0 ? amgh.a((List) anlz.y(anktVar2), amcmVar.c) : amgh.a;
        }
        ankt anktVar3 = this.a;
        ankt anktVar4 = this.b;
        awgg awggVar = (awgg) anlz.y(anktVar3);
        if (((Boolean) anlz.y(anktVar4)).booleanValue()) {
            return awggVar;
        }
        aopa mo52toBuilder = awggVar.mo52toBuilder();
        awfh awfhVar = awggVar.c;
        if (awfhVar == null) {
            awfhVar = awfh.a;
        }
        aopa mo52toBuilder2 = awfhVar.mo52toBuilder();
        awfh awfhVar2 = awggVar.c;
        if (awfhVar2 == null) {
            awfhVar2 = awfh.a;
        }
        awgf awgfVar = awfhVar2.d;
        if (awgfVar == null) {
            awgfVar = awgf.a;
        }
        aopa mo52toBuilder3 = awgfVar.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        awgf awgfVar2 = (awgf) mo52toBuilder3.instance;
        awgfVar2.b |= 2;
        awgfVar2.d = true;
        mo52toBuilder2.copyOnWrite();
        awfh awfhVar3 = (awfh) mo52toBuilder2.instance;
        awgf awgfVar3 = (awgf) mo52toBuilder3.mo39build();
        awgfVar3.getClass();
        awfhVar3.d = awgfVar3;
        awfhVar3.b |= 64;
        mo52toBuilder.copyOnWrite();
        awgg awggVar2 = (awgg) mo52toBuilder.instance;
        awfh awfhVar4 = (awfh) mo52toBuilder2.mo39build();
        awfhVar4.getClass();
        awggVar2.c = awfhVar4;
        awggVar2.b |= 2;
        return (awgg) mo52toBuilder.mo39build();
    }
}
