package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: joy  reason: default package */
/* loaded from: classes3.dex */
public final class joy implements fce, fch {
    public final Context a;
    public final aios b;
    public final ahce c;
    public final ahcy d;
    public final jpu e;
    public final acth f;
    public final jlm g;
    public final azqb h;
    public final Executor i;

    public joy(Context context, aios aiosVar, ahce ahceVar, ahcy ahcyVar, jpu jpuVar, acth acthVar, jlm jlmVar, azqb azqbVar, Executor executor) {
        this.a = context;
        this.b = aiosVar;
        this.c = ahceVar;
        this.d = ahcyVar;
        this.e = jpuVar;
        this.f = acthVar;
        this.g = jlmVar;
        this.h = azqbVar;
        this.i = executor;
    }

    @Override // defpackage.fce
    public final void a(final String str, final agqv agqvVar, final String str2) {
        if (agqvVar == null) {
            if (!amps.e(str2)) {
                this.c.i(str2, str);
                return;
            } else {
                this.d.n(str2, str, null, true);
                return;
            }
        }
        ylx.k(((agss) this.h.get()).a(agqvVar), this.i, jou.c, new ylw() { // from class: jov
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                final joy joyVar = joy.this;
                final String str3 = str;
                final agqv agqvVar2 = agqvVar;
                final String str4 = str2;
                final agqp agqpVar = (agqp) obj;
                if (agqpVar == agqp.PLAYABLE) {
                    return;
                }
                aqxo.p(agqpVar != agqp.PLAYABLE);
                ylx.k(((agss) joyVar.h.get()).b(agqvVar2), joyVar.i, jou.a, new ylw() { // from class: jow
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj2) {
                        Object c;
                        joy joyVar2 = joy.this;
                        String str5 = str3;
                        agqv agqvVar3 = agqvVar2;
                        String str6 = str4;
                        agqp agqpVar2 = agqpVar;
                        if (((Boolean) obj2).booleanValue()) {
                            if (agqpVar2 != agqp.TRANSFER_PENDING_USER_APPROVAL || amps.e(str6)) {
                                if (agqpVar2 == agqp.ERROR_PENDING_PLAYABILITY_ACTION) {
                                    joyVar2.b.k(agqvVar3.k, new jox(joyVar2, str5, str6), str5);
                                    return;
                                } else if (agqpVar2 == agqp.ERROR_STREAMS_MISSING) {
                                    joyVar2.d.u(str6, str5);
                                    return;
                                } else if (agqpVar2 == agqp.ERROR_EXPIRED) {
                                    agqu agquVar = agqvVar3.j;
                                    ahcy ahcyVar = joyVar2.d;
                                    agquVar.getClass();
                                    ahcyVar.f(agquVar, true);
                                    return;
                                } else if (agqpVar2 == agqp.ERROR_POLICY || agqpVar2 == agqp.ERROR_NOT_PLAYABLE) {
                                    agqu agquVar2 = agqvVar3.j;
                                    jlm jlmVar = joyVar2.g;
                                    if (agquVar2 != null && jlm.a(agquVar2.b)) {
                                        jlmVar.a.c(2);
                                    }
                                    if (agquVar2 == null || (c = agquVar2.c()) == null) {
                                        return;
                                    }
                                    joyVar2.d.r(str5, c, joyVar2.f.oi());
                                    return;
                                } else if (agqpVar2 == agqp.ERROR_EXPIRED_RENTAL) {
                                    joyVar2.d.d(str5, true);
                                    return;
                                } else if (joyVar2.e(agqvVar3)) {
                                    joyVar2.d.n(str6, str5, null, true);
                                    return;
                                } else {
                                    joyVar2.d.d(str5, true);
                                    return;
                                }
                            }
                            joyVar2.c.f(str6, ahbt.a(true));
                        } else if (agqpVar2 == agqp.TRANSFER_PENDING_TOOTHFAIRY) {
                            new AlertDialog.Builder(joyVar2.a).setTitle(R.string.offline_dialog_waiting_for_discount_title).setMessage(R.string.offline_dialog_waiting_for_discount_or_wifi_message).setCancelable(true).setPositiveButton(R.string.ok, gzj.d).show();
                        } else if (!agqvVar3.D() && !agqvVar3.B() && !agqvVar3.C()) {
                        } else {
                            joyVar2.e.d(R.string.offline_click_queued_offline_video_snackbar_text);
                            actj actjVar = actj.OFFLINE_VIDEO_NOT_DOWNLOADED_YET;
                            acti oi = joyVar2.f.oi();
                            if (oi == null) {
                                zep.b("No valid interaction logger.");
                            } else {
                                oi.n(new acte(actjVar));
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.fch
    public final void b(String str, jfz jfzVar, Optional optional) {
        a(str, (agqv) jfzVar.b(), (String) optional.orElse(null));
    }

    public final boolean e(agqv agqvVar) {
        try {
            return ((Boolean) ((agss) this.h.get()).c(agqvVar).get(4L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zep.d("Unable to determine if a failed download is retryable.", e);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
