package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: jpj  reason: default package */
/* loaded from: classes3.dex */
public final class jpj implements ahcd {
    private final Activity a;
    private final Context b;
    private final aafo c;
    private final ahat d;
    private final jpa e;
    private final ajgz f;

    public jpj(Activity activity, Context context, aafo aafoVar, ahat ahatVar, jpa jpaVar, ajgz ajgzVar) {
        this.a = activity;
        this.b = context;
        this.c = aafoVar;
        this.d = ahatVar;
        this.e = jpaVar;
        this.f = ajgzVar;
    }

    @Override // defpackage.ahcd
    public final void a(Object obj, acti actiVar, Pair pair, ahda ahdaVar) {
        ajgw jpiVar;
        if (this.a.isFinishing()) {
            return;
        }
        if (!(obj instanceof aqft) || actiVar == null) {
            if (!(obj instanceof aqmu) || actiVar == null) {
                this.d.a(obj, actiVar, pair, null);
                return;
            }
            aqmu aqmuVar = (aqmu) obj;
            jpa jpaVar = this.e;
            aopa createBuilder = aqft.a.createBuilder();
            if ((aqmuVar.b & 2) != 0) {
                arag g = ajgl.g(aqmuVar.d);
                createBuilder.copyOnWrite();
                aqft aqftVar = (aqft) createBuilder.instance;
                g.getClass();
                aqftVar.c = g;
                aqftVar.b |= 1;
            }
            if ((aqmuVar.b & 4) == 0) {
                if (!aqmuVar.f.isEmpty()) {
                    aopu aopuVar = aqmuVar.f;
                    createBuilder.copyOnWrite();
                    aqft aqftVar2 = (aqft) createBuilder.instance;
                    aqftVar2.a();
                    aonk.addAll((Iterable) aopuVar, (List) aqftVar2.g);
                }
            } else {
                createBuilder.ab(ajgl.g(aqmuVar.e));
            }
            arhs arhsVar = aqmuVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            createBuilder.copyOnWrite();
            aqft aqftVar3 = (aqft) createBuilder.instance;
            arhsVar.getClass();
            aqftVar3.e = arhsVar;
            aqftVar3.b |= 8;
            aoob aoobVar = aqmuVar.h;
            createBuilder.copyOnWrite();
            aqft aqftVar4 = (aqft) createBuilder.instance;
            aoobVar.getClass();
            aqftVar4.b |= 262144;
            aqftVar4.n = aoobVar;
            aoux aouxVar = aqmuVar.g;
            if (aouxVar == null) {
                aouxVar = aoux.a;
            }
            createBuilder.copyOnWrite();
            aqft aqftVar5 = (aqft) createBuilder.instance;
            aouxVar.getClass();
            aqftVar5.j = aouxVar;
            aqftVar5.b |= 1024;
            apok a = jpa.a(jpaVar.a.getResources().getText(R.string.dismiss).toString());
            createBuilder.copyOnWrite();
            aqft aqftVar6 = (aqft) createBuilder.instance;
            a.getClass();
            aqftVar6.i = a;
            aqftVar6.b |= 64;
            if (pair != null) {
                apok a2 = jpa.a((String) pair.first);
                createBuilder.copyOnWrite();
                aqft aqftVar7 = (aqft) createBuilder.instance;
                a2.getClass();
                aqftVar7.h = a2;
                aqftVar7.b |= 32;
            }
            aqft aqftVar8 = (aqft) createBuilder.mo39build();
            Context context = this.b;
            aafo aafoVar = this.c;
            ajgz ajgzVar = this.f;
            if (pair != null) {
                jpiVar = new jph(pair);
            } else {
                jpiVar = new jpi();
            }
            ajgx.p(context, aqftVar8, aafoVar, actiVar, ajgzVar, jpiVar, null);
            return;
        }
        ajgx.p(this.b, (aqft) obj, this.c, actiVar, this.f, new jpi(1), null);
    }
}
