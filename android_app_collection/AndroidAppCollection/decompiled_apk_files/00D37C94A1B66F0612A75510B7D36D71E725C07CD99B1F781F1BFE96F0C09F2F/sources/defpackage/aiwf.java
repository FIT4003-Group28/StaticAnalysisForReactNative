package defpackage;

import android.view.accessibility.CaptioningManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aiwf  reason: default package */
/* loaded from: classes.dex */
public final class aiwf implements aimx {
    public final Set a = Collections.synchronizedSet(new HashSet());
    private final ankt b;
    private final aiix c;

    public aiwf(ankt anktVar, aiix aiixVar) {
        this.b = anktVar;
        this.c = aiixVar;
    }

    public final void b(airw airwVar) {
        aypf aypfVar = new aypf();
        aypfVar.d(aiwv.j(airwVar.V(), aiyy.b).aa(new aiwe(this), aiax.q));
        aypfVar.d(airwVar.aa().aa(new aiwe(this, 1), aiax.q));
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        if (this.c.x() && this.b.isDone()) {
            try {
                ampq ampqVar = (ampq) anlz.y(this.b);
                if (!ampqVar.h()) {
                    return;
                }
                CaptioningManager captioningManager = (CaptioningManager) ampqVar.c();
                aopa createBuilder = asah.a.createBuilder();
                if (captioningManager.isEnabled()) {
                    createBuilder.copyOnWrite();
                    asah asahVar = (asah) createBuilder.instance;
                    asahVar.b |= 1;
                    asahVar.c = true;
                }
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    String language = locale.getLanguage();
                    createBuilder.copyOnWrite();
                    asah asahVar2 = (asah) createBuilder.instance;
                    language.getClass();
                    asahVar2.b |= 2;
                    asahVar2.d = language;
                }
                if (!this.a.isEmpty()) {
                    Set set = this.a;
                    createBuilder.copyOnWrite();
                    asah asahVar3 = (asah) createBuilder.instance;
                    aopu aopuVar = asahVar3.e;
                    if (!aopuVar.c()) {
                        asahVar3.e = aopi.mutableCopy(aopuVar);
                    }
                    aonk.addAll((Iterable) set, (List) asahVar3.e);
                }
                final asah asahVar4 = (asah) createBuilder.mo39build();
                ainaVar.y = asahVar4;
                ainaVar.t(new aimz() { // from class: aiwd
                    @Override // defpackage.aimz
                    public final void a(afrt afrtVar) {
                        afrtVar.e("captionParams", asah.this.toByteArray());
                    }
                });
            } catch (ExecutionException e) {
                zep.d("Exception getting CaptioningManager", e);
            }
        }
    }
}
