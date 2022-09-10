package defpackage;

import android.content.Intent;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ckro  reason: default package */
/* loaded from: classes4.dex */
public final class ckro implements ckrp {
    private final gga a;
    private final cjqy b;
    private final dxio<brba> c;
    private final dxio<cref> d;
    private final dxio<brlz> e;
    private final dxio<afha> f;
    private final ckco g;
    private final cjqq h;
    private final dxio<bvjj> i;

    public ckro(gga ggaVar, cjqy cjqyVar, dxio<brba> dxioVar, dxio<cref> dxioVar2, dxio<brlz> dxioVar3, dxio<afha> dxioVar4, ckcw ckcwVar, cjqq cjqqVar, dxio<bvjj> dxioVar5) {
        this.a = ggaVar;
        this.b = cjqyVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
        this.g = (ckco) ckcwVar.a(ckhi.S);
        this.h = cjqqVar;
        this.i = dxioVar5;
    }

    private final void e(@dzsi Intent intent) {
        if (intent == null) {
            return;
        }
        this.f.a().j(intent, awnn.SPEECH_RECOGNITION.ordinal(), 1);
    }

    @Override // defpackage.ckrp
    public final void a() {
        Intent b = ckri.b(this.a);
        if (b != null) {
            String z = this.i.a().z(bvjk.Q, null);
            if (!dbsj.d(z)) {
                b.putExtra("android.speech.extra.LANGUAGE", z);
                b.putExtra("android.speech.extra.PROMPT", this.a.getResources().getString(R.string.VOICE_SEARCH_DEFAULT_PROMPT));
            }
        }
        e(b);
    }

    @Override // defpackage.ckrp
    public final void b() {
        daqq daqqVar = this.e.a().g;
        if (!this.e.a().c()) {
            this.g.a(-1);
        } else if (daqqVar == null) {
            this.g.a(-2);
        } else {
            ckco ckcoVar = this.g;
            int a = daqo.a(daqqVar.c);
            if (a == 0) {
                a = 1;
            }
            ckcoVar.a(a - 1);
        }
        e(ckri.c(this.a));
    }

    @Override // defpackage.ckrp
    public final void c(int i, Intent intent) {
        if (i != -1) {
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra.isEmpty()) {
            return;
        }
        String str = stringArrayListExtra.get(0);
        if (dbsj.d(str)) {
            return;
        }
        this.c.a().p(str, this.b.n(this.h.g().d(cjtd.a(dtyi.cW)), new cjte(deaf.INPUT_VOICE), cjtd.a(dtyi.cW)));
    }

    @Override // defpackage.ckrp
    public final boolean d() {
        Intent d;
        if (this.d.a().j() && (d = ckri.d(this.a)) != null) {
            this.f.a().o(d, 1);
            return true;
        }
        return false;
    }
}
