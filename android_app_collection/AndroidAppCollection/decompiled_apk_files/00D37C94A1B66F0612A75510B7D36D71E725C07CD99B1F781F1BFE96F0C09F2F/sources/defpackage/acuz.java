package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acuz  reason: default package */
/* loaded from: classes.dex */
public final class acuz implements acux {
    public final Set a;
    public boolean b;
    private final MessageQueue.IdleHandler c = new MessageQueue.IdleHandler() { // from class: acuy
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            acuz acuzVar = acuz.this;
            if (!acuzVar.b) {
                zep.g("ColdGuard ran");
                acuzVar.b = true;
                Set set = acuzVar.a;
                if (set == null || set.isEmpty()) {
                    return false;
                }
                for (acuw acuwVar : acuzVar.a) {
                    acuwVar.c();
                }
                return false;
            }
            return false;
        }
    };

    public acuz(Set set) {
        this.a = set;
    }

    @Override // defpackage.acux
    public final /* synthetic */ ayos d() {
        return ayos.x(new UnsupportedOperationException());
    }

    @Override // defpackage.acux
    public final void e() {
        ylr.c();
        if (!this.b) {
            Looper.myQueue().removeIdleHandler(this.c);
            this.b = true;
        }
    }

    @Override // defpackage.acux
    public final void f() {
        ylr.c();
        MessageQueue myQueue = Looper.myQueue();
        myQueue.removeIdleHandler(this.c);
        myQueue.addIdleHandler(this.c);
        this.b = false;
    }

    @Override // defpackage.acux
    public final /* synthetic */ boolean g() {
        return false;
    }
}
