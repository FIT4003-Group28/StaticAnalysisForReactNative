package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: twg  reason: default package */
/* loaded from: classes4.dex */
public final class twg implements twy {
    public final Context a;
    public final trv b;
    private final Executor c;
    private final tqe d;
    private final vne e;

    public twg(Context context, trv trvVar, vne vneVar, Executor executor, tqe tqeVar) {
        this.a = context;
        this.b = trvVar;
        this.e = vneVar;
        this.c = executor;
        this.d = tqeVar;
    }

    @Override // defpackage.twy
    public final ankt a() {
        return this.e.b(tvv.s, this.c);
    }

    public final ankt b(final tvg tvgVar, final int i) {
        ankt h;
        if (i <= tvgVar.d) {
            tvg a = tvg.a(i);
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                h = anhq.h(anii.h(anko.q(this.e.b(new twd(this, 1), this.c)), tvv.o, this.c), IOException.class, new twd(this, 2), this.c);
            } else if (ordinal == 2) {
                h = anhq.h(anii.h(anko.q(this.e.b(new twd(this), this.c)), tvv.p, this.c), IOException.class, new twd(this, 3), this.c);
            } else {
                String name = a.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
                sb.append("Upgrade to version ");
                sb.append(name);
                sb.append("not supported!");
                h = anlz.p(new UnsupportedOperationException(sb.toString()));
            }
            return anii.i(h, new anir() { // from class: twb
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    twg twgVar = twg.this;
                    int i2 = i;
                    tvg tvgVar2 = tvgVar;
                    if (((Boolean) obj).booleanValue()) {
                        twx.d(twgVar.a, tvg.a(i2));
                        return twgVar.b(tvgVar2, i2 + 1);
                    }
                    return anlz.q(false);
                }
            }, this.c);
        }
        return anlz.q(true);
    }

    @Override // defpackage.twy
    public final ankt c() {
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        return anii.h(this.e.b(new ampg() { // from class: twe
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                twg twgVar = twg.this;
                AtomicReference atomicReference2 = atomicReference;
                trb trbVar = (trb) obj;
                ArrayList arrayList = new ArrayList();
                aopa mo52toBuilder = trbVar.mo52toBuilder();
                for (String str : Collections.unmodifiableMap(trbVar.b).keySet()) {
                    try {
                        arrayList.add(tzh.b(str, twgVar.a, twgVar.b));
                    } catch (tzg e) {
                        mo52toBuilder.B(str);
                        String valueOf = String.valueOf(str);
                        typ.i(e, valueOf.length() != 0 ? "Failed to deserialize newFileKey:".concat(valueOf) : new String("Failed to deserialize newFileKey:"));
                        twgVar.b.a(e, "Failed to deserialize newFileKey, unexpected key size: %s", Integer.valueOf(amqf.c("|").h(str).size()));
                    }
                }
                atomicReference2.set(arrayList);
                return (trb) mo52toBuilder.mo39build();
            }
        }, this.c), new amde(atomicReference, 1), this.c);
    }

    @Override // defpackage.twy
    public final ankt d() {
        if (twx.c(this.a)) {
            this.d.p();
            tvg a = tvg.a(2);
            tvg b = twx.b(this.a, this.b);
            int i = a.d;
            int i2 = b.d;
            if (i == i2) {
                return anlz.q(true);
            }
            if (i < i2) {
                typ.e("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", b, a);
                trv trvVar = this.b;
                String valueOf = String.valueOf(b);
                String valueOf2 = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
                sb.append("Downgraded file key from ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                sb.append(".");
                trvVar.a(new Exception(sb.toString()), "FileKey migrations unexpected downgrade.", new Object[0]);
                twx.d(this.a, a);
                return anlz.q(false);
            }
            return anii.i(anhq.i(anko.q(b(a, i2 + 1)), Exception.class, new twc(this, a), this.c), new twc(this, a, 1), this.c);
        }
        int i3 = typ.a;
        twx.e(this.a);
        Context context = this.a;
        this.d.p();
        twx.d(context, tvg.a(2));
        return anlz.q(false);
    }

    @Override // defpackage.twy
    public final ankt e(tqy tqyVar) {
        return anii.h(this.e.a(), new fct(tzh.c(tqyVar, this.a, this.b), 14), this.c);
    }

    @Override // defpackage.twy
    public final ankt f(tqy tqyVar) {
        return anhq.h(anii.h(anko.q(this.e.b(new fct(tzh.c(tqyVar, this.a, this.b), 15), this.c)), tvv.q, this.c), IOException.class, tvv.m, this.c);
    }

    @Override // defpackage.twy
    public final ankt g(tqy tqyVar, final tqz tqzVar) {
        final String c = tzh.c(tqyVar, this.a, this.b);
        return anhq.h(anii.h(anko.q(this.e.b(new ampg() { // from class: twf
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str = c;
                tqz tqzVar2 = tqzVar;
                aopa mo52toBuilder = ((trb) obj).mo52toBuilder();
                mo52toBuilder.A(str, tqzVar2);
                return (trb) mo52toBuilder.mo39build();
            }
        }, this.c)), tvv.r, this.c), IOException.class, tvv.n, this.c);
    }

    public final void h(tvg tvgVar) {
        if (twx.b(this.a, this.b).d == tvgVar.d || twx.d(this.a, tvgVar)) {
            return;
        }
        String valueOf = String.valueOf(tvgVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
        sb.append("Failed to commit migration version to disk. Fail to set target version to ");
        sb.append(valueOf);
        sb.append(".");
        typ.b(sb.toString());
        trv trvVar = this.b;
        String valueOf2 = String.valueOf(tvgVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Fail to set target version ");
        sb2.append(valueOf2);
        sb2.append(".");
        trvVar.a(new Exception(sb2.toString()), "Failed to commit migration version to disk.", new Object[0]);
    }
}
