package defpackage;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* compiled from: PG */
/* renamed from: dbay  reason: default package */
/* loaded from: classes5.dex */
public final class dbay {
    boolean a = false;
    final /* synthetic */ InstallActivity b;

    public dbay(InstallActivity installActivity) {
        this.b = installActivity;
    }

    public final void a(dbaz dbazVar) {
        synchronized (this.b) {
            if (this.a) {
                return;
            }
            InstallActivity.access$402(this.b, dbazVar);
            dbaz dbazVar2 = dbaz.ACCEPTED;
            ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
            ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            int ordinal = dbazVar.ordinal();
            if (ordinal == 0) {
                return;
            }
            if (ordinal == 1) {
                InstallActivity.access$000(this.b, new UnavailableUserDeclinedInstallationException());
            } else if (ordinal == 2) {
                if (!InstallActivity.access$500(this.b) && dbao.a.c) {
                    InstallActivity.access$600(this.b);
                }
                InstallActivity.access$000(this.b, null);
            }
            this.a = true;
        }
    }

    public final void b(Exception exc) {
        synchronized (this.b) {
            if (this.a) {
                return;
            }
            this.a = true;
            InstallActivity.access$402(this.b, dbaz.CANCELLED);
            InstallActivity.access$000(this.b, exc);
        }
    }
}
