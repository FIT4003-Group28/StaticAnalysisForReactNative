package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: akyr  reason: default package */
/* loaded from: classes.dex */
public final class akyr implements ankb {
    final /* synthetic */ akys a;
    private final /* synthetic */ int b;

    public akyr(akys akysVar) {
        this.a = akysVar;
    }

    public akyr(akys akysVar, int i) {
        this.b = i;
        this.a = akysVar;
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.b;
        if (i == 0) {
            Boolean bool = (Boolean) obj;
        } else if (i == 1) {
            Boolean bool2 = (Boolean) obj;
        } else {
            List list = (List) obj;
        }
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        int i = this.b;
        if (i == 0) {
            this.a.h.b("Failed to cancel upload job.", th);
            zep.f("UploadEngine", "Failed to cancel upload job.", th);
        } else if (i == 1) {
            this.a.h.b("Failed to update feedback only job.", th);
            zep.f("UploadEngine", "Failed to update feedback only job.", th);
        } else if (th instanceof CancellationException) {
        } else {
            this.a.h.b("Failed to get pending uploads.", th);
            zep.f("UploadEngine", "Failed to get pending uploads.", th);
        }
    }
}
