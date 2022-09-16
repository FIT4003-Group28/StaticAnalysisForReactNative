package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: yvi  reason: default package */
/* loaded from: classes4.dex */
public final class yvi implements vld {
    public final azqb a;
    public amup b = amyc.b;
    private final ampt c;
    private final ampg d;
    private final ampg e;
    private final yjc f;
    private final ankw g;

    public yvi(azqb azqbVar, ampt amptVar, ampg ampgVar, ampg ampgVar2, yjc yjcVar, ankw ankwVar) {
        this.a = azqbVar;
        this.c = amptVar;
        this.d = ampgVar;
        this.e = ampgVar2;
        this.f = yjcVar;
        this.g = ankwVar;
    }

    public static yvh d(azqb azqbVar, ankw ankwVar) {
        return new yvh(azqbVar, ankwVar);
    }

    @Override // defpackage.vld
    public final ankt a() {
        if (this.b.isEmpty()) {
            return anlz.q(null);
        }
        return this.g.qp(new Callable() { // from class: yvf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yvi yviVar = yvi.this;
                SharedPreferences.Editor edit = ((SharedPreferences) yviVar.a.get()).edit();
                amzs it = yviVar.b.keySet().iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                if (edit.commit()) {
                    yviVar.b = amyc.b;
                    return null;
                }
                throw new IOException("Failed to clear the keys from SharedPreferences.");
            }
        });
    }

    @Override // defpackage.vld
    public final /* bridge */ /* synthetic */ ankt b(aoqu aoquVar) {
        aopi aopiVar = (aopi) aoquVar;
        Boolean bool = (Boolean) this.d.apply(aopiVar);
        if (bool == null) {
            return anlz.p(new IllegalArgumentException("isMigrated cannot return a null value"));
        }
        if (bool.booleanValue()) {
            return anlz.q(aopiVar);
        }
        aopa mo52toBuilder = aopiVar.mo52toBuilder();
        amum h = amup.h();
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a.get()).getAll().entrySet()) {
            if (this.c.a(entry.getKey())) {
                if (entry instanceof Set) {
                    h.f(entry.getKey(), amvn.p((Set) entry));
                } else {
                    h.d(entry);
                }
            }
        }
        this.b = h.b();
        this.f.a(new yvg(this.b), mo52toBuilder);
        this.e.apply(mo52toBuilder);
        return anlz.q(mo52toBuilder.mo39build());
    }

    @Override // defpackage.vld
    public final ankt c() {
        return anlz.q(true);
    }
}
