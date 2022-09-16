package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: actr  reason: default package */
/* loaded from: classes.dex */
public final class actr {
    final Map a = new HashMap();
    final Map b = new HashMap();

    public actr() {
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized InteractionLoggingScreen a(acuc acucVar) {
        Deque deque = (Deque) this.a.get(acucVar);
        if (deque != null) {
            return (InteractionLoggingScreen) deque.peekFirst();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(InteractionLoggingScreen interactionLoggingScreen, acub acubVar) {
        String str = interactionLoggingScreen.a;
        if (TextUtils.isEmpty(str)) {
            zep.b("Empty CSN found when addVisibilityControllerToScreen");
            return;
        }
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(new WeakReference(acubVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen == null) {
            zep.b("Null interactionLoggingScreen found when removeInteractionLoggingScreen.");
            return;
        }
        for (Deque deque : this.a.values()) {
            if (deque.contains(interactionLoggingScreen)) {
                deque.remove(interactionLoggingScreen);
            }
        }
        String str = interactionLoggingScreen.a;
        if (!TextUtils.isEmpty(str) && this.b.containsKey(str)) {
            for (WeakReference weakReference : (List) this.b.get(str)) {
                if (weakReference.get() != null) {
                    ((acub) weakReference.get()).b();
                }
            }
            this.b.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(acuc acucVar, InteractionLoggingScreen interactionLoggingScreen) {
        Deque deque = (Deque) this.a.get(acucVar);
        if (deque == null) {
            deque = new ArrayDeque();
            this.a.put(acucVar, deque);
        }
        if (deque.contains(interactionLoggingScreen)) {
            deque.remove(interactionLoggingScreen);
        }
        deque.addFirst(interactionLoggingScreen);
        Deque deque2 = (Deque) this.a.get(acucVar);
        if (deque2 != null && deque2.size() > 3) {
            while (deque2.size() > 3) {
                c((InteractionLoggingScreen) deque2.removeLast());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (acuc acucVar : this.a.keySet()) {
            sb.append(str);
            sb.append(acucVar);
            sb.append(" = {");
            String str2 = "";
            for (InteractionLoggingScreen interactionLoggingScreen : (Deque) this.a.get(acucVar)) {
                sb.append(str2);
                sb.append(interactionLoggingScreen.a);
                str2 = ", ";
            }
            sb.append("}");
            str = ", ";
        }
        return sb.toString();
    }
}
