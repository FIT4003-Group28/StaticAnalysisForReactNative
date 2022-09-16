package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agqv  reason: default package */
/* loaded from: classes.dex */
public final class agqv implements agpu {
    public final agqo a;
    public final attl b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final agqu j;
    public final asaa k;
    public final agqe l;
    public final agqn m;
    public final agqm n;
    public final agqz o;
    public final PlayerResponseModel p;

    public agqv(agqo agqoVar, attl attlVar, int i, byte[] bArr, boolean z, long j, long j2, long j3, long j4, agqu agquVar, asaa asaaVar, agqe agqeVar, agqn agqnVar, agqm agqmVar, agqz agqzVar, PlayerResponseModel playerResponseModel) {
        agqoVar.getClass();
        this.a = agqoVar;
        this.b = attlVar;
        this.c = i;
        this.d = bArr;
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = agquVar;
        this.k = asaaVar;
        this.l = agqeVar;
        this.m = agqnVar;
        this.n = agqmVar;
        this.o = agqzVar;
        this.p = playerResponseModel;
    }

    public final boolean A() {
        return this.l == agqe.ACTIVE;
    }

    public final boolean B() {
        agqz agqzVar;
        return A() && (agqzVar = this.o) != null && agqzVar.b();
    }

    public final boolean C() {
        return this.l == agqe.PAUSED;
    }

    public final boolean D() {
        agqz agqzVar;
        return A() && (agqzVar = this.o) != null && agqzVar.b == avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public final boolean E() {
        return this.l == agqe.STREAM_DOWNLOAD_PENDING;
    }

    @Override // defpackage.agpu
    public final boolean a() {
        agqm agqmVar = this.n;
        return agqmVar == null || agqmVar.e;
    }

    @Override // defpackage.agpu
    public final boolean b() {
        return this.l == agqe.COMPLETE;
    }

    public final int c() {
        if (d() > 0) {
            return (int) ((e() * 100) / d());
        }
        return 0;
    }

    public final long d() {
        agqm agqmVar = this.n;
        if (agqmVar == null) {
            return 0L;
        }
        return agqmVar.d;
    }

    public final long e() {
        agqm agqmVar = this.n;
        if (agqmVar == null) {
            return 0L;
        }
        return agqmVar.c;
    }

    public final long f() {
        agqu agquVar = this.j;
        if (agquVar == null || !agquVar.f()) {
            return this.a.a();
        }
        return 0L;
    }

    public final Uri g() {
        agqo agqoVar;
        aalc aalcVar;
        agqu agquVar = this.j;
        if ((agquVar == null || !agquVar.f()) && (aalcVar = (agqoVar = this.a).b) != null && !aalcVar.a.isEmpty()) {
            return agqoVar.b.c(240).a();
        }
        return null;
    }

    public final agqa h() {
        agqu agquVar = this.j;
        if (agquVar == null || !agquVar.f()) {
            return this.a.a;
        }
        return null;
    }

    @Deprecated
    public final agqp i() {
        agqz agqzVar;
        if (u()) {
            if (E()) {
                return agqp.TRANSFER_PENDING_USER_APPROVAL;
            }
            if (r()) {
                return agqp.ERROR_PENDING_PLAYABILITY_ACTION;
            }
            if (w()) {
                return agqp.ERROR_NOT_PLAYABLE;
            }
            if (this.j != null && x()) {
                if (this.j.e()) {
                    return agqp.ERROR_EXPIRED;
                }
                return agqp.ERROR_POLICY;
            } else if (!a()) {
                return agqp.ERROR_STREAMS_MISSING;
            } else {
                if (this.l == agqe.STREAMS_OUT_OF_DATE) {
                    return agqp.ERROR_STREAMS_OUT_OF_DATE;
                }
                agqp agqpVar = agqp.DELETED;
                int ordinal = this.l.ordinal();
                return ordinal != 5 ? ordinal != 6 ? agqp.ERROR_GENERIC : agqp.ERROR_NETWORK : agqp.ERROR_DISK;
            }
        } else if (b()) {
            return agqp.PLAYABLE;
        } else {
            if (s()) {
                return agqp.CANDIDATE;
            }
            if (C()) {
                return agqp.TRANSFER_PAUSED;
            }
            if (B()) {
                if (z()) {
                    return agqp.ERROR_DISK_SD_CARD;
                }
                return agqp.TRANSFER_IN_PROGRESS;
            }
            if (D() && (agqzVar = this.o) != null) {
                int i = agqzVar.c;
                if ((i & 2) != 0) {
                    return agqp.TRANSFER_PENDING_NETWORK;
                }
                if ((i & 8) != 0) {
                    return agqp.TRANSFER_PENDING_WIFI;
                }
                if ((i & 4096) != 0) {
                    return agqp.TRANSFER_PENDING_STORAGE;
                }
            }
            return agqp.TRANSFER_WAITING_IN_QUEUE;
        }
    }

    public final attp j() {
        agqo agqoVar = this.a;
        atsk atskVar = agqoVar.e.p;
        if (atskVar == null) {
            atskVar = atsk.a;
        }
        if ((atskVar.b & 1) != 0) {
            atsk atskVar2 = agqoVar.e.p;
            if (atskVar2 == null) {
                atskVar2 = atsk.a;
            }
            attp attpVar = atskVar2.c;
            return attpVar == null ? attp.a : attpVar;
        }
        return null;
    }

    public final avhn k() {
        agqu agquVar = this.j;
        if (agquVar == null || !agquVar.f()) {
            return this.a.d();
        }
        return null;
    }

    public final String l(agqp agqpVar, Context context) {
        asaa asaaVar = this.k;
        agqu agquVar = this.j;
        int c = c();
        agqp agqpVar2 = agqp.DELETED;
        agqe agqeVar = agqe.DELETED;
        switch (agqpVar.ordinal()) {
            case 0:
                return context.getString(R.string.offline_video_deleted);
            case 1:
            case 2:
                return "";
            case 3:
                return context.getString(R.string.offline_adding_progress, Integer.valueOf(c));
            case 4:
                return context.getString(R.string.offline_waiting, Integer.valueOf(c));
            case 5:
                return context.getString(R.string.offline_stream_pending);
            case 6:
                return context.getString(R.string.offline_waiting_for_network);
            case 7:
                return context.getString(R.string.offline_waiting_for_wifi);
            case 8:
                return context.getString(R.string.offline_waiting_tap_here);
            case 9:
                return context.getString(R.string.offline_waiting_for_space);
            case 10:
                return context.getString(R.string.offline_paused, Integer.valueOf(c));
            case 11:
            case 18:
            default:
                return context.getString(R.string.offline_failed);
            case 12:
                if (asaaVar != null) {
                    return asaaVar.d;
                }
                return context.getString(R.string.offline_failed);
            case 13:
                return context.getString(R.string.offline_failed_file_not_found);
            case 14:
                return context.getString(R.string.offline_stream_out_of_date);
            case 15:
                if (agquVar != null) {
                    atse atseVar = agquVar.b;
                    if ((atseVar.b & 16) != 0) {
                        return atseVar.i;
                    }
                }
                return (asaaVar == null || (asaaVar.b & 2) == 0 || asaaVar.d.isEmpty()) ? context.getString(R.string.offline_video_not_playable) : asaaVar.d;
            case 16:
                if (agquVar != null) {
                    atse atseVar2 = agquVar.b;
                    if ((atseVar2.b & 16) != 0) {
                        return atseVar2.i;
                    }
                }
                return context.getString(R.string.offline_failed);
            case 17:
                return context.getString(R.string.offline_expired);
            case 19:
                return context.getString(R.string.offline_failed_network_error);
            case 20:
                return context.getString(R.string.offline_failed_disk_error);
            case 21:
                return context.getString(R.string.offline_temp_disk_error_sd_card);
        }
    }

    public final String m() {
        return this.a.f();
    }

    public final String n() {
        agqu agquVar = this.j;
        return (agquVar == null || !agquVar.f()) ? this.a.g() : "";
    }

    public final String o(Context context) {
        agqu agquVar = this.j;
        return (agquVar == null || !agquVar.f()) ? this.a.j() : context.getString(R.string.expired_video_title);
    }

    public final boolean p() {
        agqu agquVar = this.j;
        return (agquVar == null || agquVar.d() == null || this.l == agqe.DELETED || this.l == agqe.CANNOT_OFFLINE) ? false : true;
    }

    public final boolean q(adzz adzzVar) {
        FormatStreamModel c;
        agqm agqmVar = this.n;
        if (agqmVar != null && (c = agqmVar.c()) != null) {
            if (TimeUnit.MICROSECONDS.toSeconds(adzzVar.a(c, 0L)) >= this.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return w() && aijr.j(this.k);
    }

    public final boolean s() {
        return this.l == agqe.METADATA_ONLY;
    }

    public final boolean t() {
        agqu agquVar = this.j;
        return (agquVar != null && !agquVar.g()) || this.l == agqe.CANNOT_OFFLINE;
    }

    @Deprecated
    public final boolean u() {
        return !A() && !C() && !s() && (x() || w() || !b() || !a());
    }

    public final boolean v() {
        agqm agqmVar;
        if (!u() && (agqmVar = this.n) != null) {
            agql agqlVar = agqmVar.b;
            agql agqlVar2 = agqmVar.a;
            if (agqlVar != null && agqlVar.i() && agqlVar2 != null && agqlVar2.d > 0 && !agqlVar2.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        asaa asaaVar = this.k;
        return asaaVar != null && !aijr.i(asaaVar);
    }

    public final boolean x() {
        agqu agquVar = this.j;
        return agquVar != null && !agquVar.h();
    }

    public final boolean y() {
        return !A() && !x() && !C() && this.l != agqe.CANNOT_OFFLINE && !b();
    }

    public final boolean z() {
        agqz agqzVar = this.o;
        return agqzVar != null && agqzVar.g.k("sd_card_offline_disk_error");
    }
}
