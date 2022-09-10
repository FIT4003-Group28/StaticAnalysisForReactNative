package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byts  reason: default package */
/* loaded from: classes4.dex */
public final class byts extends gen implements DialogInterface.OnClickListener {
    public bytc a;
    public bytb b;
    public byud c;
    public auhi d;
    public Executor e;

    @Override // defpackage.ges
    public final void Nv() {
        ((bytt) btsx.b(bytt.class, this)).dr(this);
    }

    @Override // defpackage.gen
    protected final void aX() {
        J().finish();
    }

    @Override // defpackage.gen
    public final /* bridge */ /* synthetic */ Dialog i(Bundle bundle) {
        String sb;
        qx qxVar = new qx(J());
        bysu h = bysu.h(this.o);
        if (h.g()) {
            sb = J().getString(R.string.TRANSIT_GLOBAL_BAN_NOTIFICATION);
        } else {
            String string = J().getString(R.string.TRANSIT_PER_STATION_BAN_NOTIFICATION_TITLE);
            String string2 = J().getString(R.string.TRANSIT_PER_STATION_BAN_NOTIFICATION_TEXT, new Object[]{h.c()});
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(string2).length());
            sb2.append(string);
            sb2.append("\n\n");
            sb2.append(string2);
            sb = sb2.toString();
        }
        qxVar.f(sb);
        qxVar.g(J().getString(R.string.TRANSIT_NOTIFICATION_TURN_OFF), this);
        qxVar.h(J().getString(R.string.TRANSIT_NOTIFICATION_KEEEP_ON), this);
        return qxVar.c();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bysu h = bysu.h(this.o);
        if (!h.g()) {
            final String b = h.b();
            if (i == -1) {
                this.e.execute(new Runnable(this, b) { // from class: bytq
                    private final byts a;
                    private final String b;

                    {
                        this.a = this;
                        this.b = b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byts bytsVar = this.a;
                        bytsVar.b.h(this.b);
                    }
                });
                this.c.a(h.e(), h.f());
            } else {
                this.e.execute(new Runnable(this, b) { // from class: bytr
                    private final byts a;
                    private final String b;

                    {
                        this.a = this;
                        this.b = b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byts bytsVar = this.a;
                        bytsVar.b.g(this.b);
                    }
                });
                this.c.b(h.e(), h.f());
            }
        } else if (i == -1) {
            this.a.a(65);
            this.e.execute(new Runnable(this) { // from class: byto
                private final byts a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.f();
                }
            });
        } else {
            this.a.a(64);
            this.d.e(dpyv.TRANSIT_STATION.dm, aufs.DISABLED);
            this.e.execute(new Runnable(this) { // from class: bytp
                private final byts a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.i();
                }
            });
        }
        aT();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return bysu.h(this.o).g() ? dtyi.dh : dtyi.di;
    }
}
