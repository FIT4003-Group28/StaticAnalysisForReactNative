package defpackage;

import android.animation.Animator;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eha  reason: default package */
/* loaded from: classes6.dex */
public final class eha {
    private static final dcqe b = dcqe.c("eha");
    public final Map<ehb, egz> a = new EnumMap(ehb.class);

    public final void a(ehb ehbVar, Animator animator) {
        if (ehbVar.d) {
            bvoo.h("Sequential transition animation type %s cannot run addAnimatorForType which is for non-sequential animations. Please use addEnterAnimatorForType or addExitAnimatorForType instead.", ehbVar.name());
        }
        if (!this.a.containsKey(ehbVar)) {
            this.a.put(ehbVar, new egz());
        }
        this.a.get(ehbVar).a.add(animator);
    }

    public final void b(ehb ehbVar, Animator animator) {
        if (!ehbVar.d) {
            bvoo.h("Non-sequential transition animation type %s cannot run exit and enter animation sequences. Please use addAnimatorForType instead.", ehbVar.name());
        }
        if (!this.a.containsKey(ehbVar)) {
            this.a.put(ehbVar, new egz());
        }
        this.a.get(ehbVar).b.add(animator);
    }

    public final void c(ehb ehbVar, Animator animator) {
        if (!ehbVar.d) {
            bvoo.h("Non-sequential transition animation type %s cannot run exit and enter animation sequences. Please use addAnimatorForType instead.", ehbVar.name());
        }
        if (!this.a.containsKey(ehbVar)) {
            this.a.put(ehbVar, new egz());
        }
        this.a.get(ehbVar).a.add(animator);
    }
}
