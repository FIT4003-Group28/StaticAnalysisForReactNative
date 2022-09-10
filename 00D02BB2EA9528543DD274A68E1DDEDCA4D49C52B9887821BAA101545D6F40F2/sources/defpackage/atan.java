package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atan  reason: default package */
/* loaded from: classes2.dex */
public final class atan implements atcv {
    private final dcdc<atcv> a;
    private final atdd b;
    private final Executor c;
    private final btvo d;
    private final LinkedHashMap<atcv, atam> e = new LinkedHashMap<>();
    private boolean f;

    public atan(dcdc<atcv> dcdcVar, atdd atddVar, Executor executor, btvo btvoVar) {
        this.a = dcdcVar;
        this.b = atddVar;
        this.c = executor;
        this.d = btvoVar;
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).NZ(bundle);
        }
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (atlqVar2 != null && this.d.getNavigationParameters().T()) {
            synchronized (this.e) {
                dcpe<atcv> listIterator = this.a.listIterator();
                while (listIterator.hasNext()) {
                    atcv next = listIterator.next();
                    atam atamVar = this.e.get(next);
                    if (atamVar == null) {
                        this.e.put(next, new atam(next, atlqVar, atlqVar2));
                    } else {
                        atamVar.b = atlqVar;
                    }
                }
                if (this.f) {
                    return;
                }
                this.f = true;
                this.c.execute(new Runnable(this) { // from class: atak
                    private final atan a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h();
                    }
                });
                return;
            }
        }
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).Oc(atlqVar, atlqVar2);
        }
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).Qo(configuration);
        }
    }

    @Override // defpackage.asmo
    public final void Qp() {
        synchronized (this.e) {
            if (this.f) {
                this.e.clear();
            }
        }
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).Qp();
        }
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).Qr(bundle);
        }
    }

    @Override // defpackage.asmo
    public final void b() {
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b();
        }
        this.b.I();
    }

    @Override // defpackage.asmo
    public final void c() {
        dcdc<atcv> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).c();
        }
    }

    public final void h() {
        synchronized (this.e) {
            Iterator<Map.Entry<atcv, atam>> it = this.e.entrySet().iterator();
            if (!it.hasNext()) {
                this.f = false;
                return;
            }
            Map.Entry<atcv, atam> next = it.next();
            atam value = next.getValue();
            this.e.remove(next.getKey());
            value.a.Oc(value.b, value.c);
            this.c.execute(new Runnable(this) { // from class: atal
                private final atan a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
        }
    }
}
