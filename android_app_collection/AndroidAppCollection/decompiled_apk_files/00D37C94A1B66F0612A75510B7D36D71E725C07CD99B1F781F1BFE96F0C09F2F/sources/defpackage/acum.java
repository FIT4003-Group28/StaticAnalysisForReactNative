package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: acum  reason: default package */
/* loaded from: classes.dex */
public class acum {
    public awbs a;
    public asvv b;

    public acum() {
    }

    public acum(awbs awbsVar) {
        this.a = awbsVar;
    }

    public acum(InteractionLoggingScreen interactionLoggingScreen, actj actjVar) {
        int i = actjVar.II;
        interactionLoggingScreen.getClass();
        int b = interactionLoggingScreen.b(i);
        aopa createBuilder = awbs.a.createBuilder();
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        createBuilder.copyOnWrite();
        awbs awbsVar2 = (awbs) createBuilder.instance;
        awbsVar2.b |= 8;
        awbsVar2.f = b;
        this.a = (awbs) createBuilder.mo39build();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(valueOf);
        return sb.toString();
    }
}
