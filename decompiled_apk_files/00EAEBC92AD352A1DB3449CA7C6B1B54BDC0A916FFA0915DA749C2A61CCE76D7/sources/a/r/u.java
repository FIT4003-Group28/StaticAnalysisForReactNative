package a.r;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f681a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f682b;

    public static u a(ViewGroup viewGroup) {
        return (u) viewGroup.getTag(s.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, u uVar) {
        viewGroup.setTag(s.transition_current_scene, uVar);
    }

    public void a() {
        Runnable runnable;
        if (a(this.f681a) != this || (runnable = this.f682b) == null) {
            return;
        }
        runnable.run();
    }
}
