package defpackage;

import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jql  reason: default package */
/* loaded from: classes3.dex */
public final class jql {
    public final aios a;
    public final jfv b;
    public final ahce c;
    public final jpo d;
    public final jpu e;
    public final acth f;
    public final jlm g;
    public final Executor h;
    public final Executor i;

    public jql(aios aiosVar, jfv jfvVar, ahce ahceVar, jpo jpoVar, jpu jpuVar, acth acthVar, jlm jlmVar, Executor executor, Executor executor2) {
        this.a = aiosVar;
        this.b = jfvVar;
        this.c = ahceVar;
        this.d = jpoVar;
        this.e = jpuVar;
        this.f = acthVar;
        this.g = jlmVar;
        this.h = executor;
        this.i = executor2;
    }

    public static atse a(atss atssVar) {
        try {
            return (atse) aopi.parseFrom(atse.a, atssVar.getOfflineStateBytes(), aoos.b());
        } catch (aopx unused) {
            return atse.a;
        }
    }

    public static final Optional e(atse atseVar) {
        aqft aqftVar;
        if (atseVar.c == 7) {
            atsd atsdVar = (atsd) atseVar.d;
            int i = atsdVar.b;
            if (i == 53345347) {
                return Optional.of((aqmu) atsdVar.c);
            }
            if (i != 64099105) {
                return Optional.empty();
            }
            if (atsdVar.b == 64099105) {
                aqftVar = (aqft) atsdVar.c;
            } else {
                aqftVar = aqft.a;
            }
            return Optional.of(aqftVar);
        }
        return Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(final String str, final jfz jfzVar, final Optional optional, final Optional optional2, final Optional optional3) {
        ylx.k(this.b.a(jfzVar), this.h, jou.e, new ylw() { // from class: jqe
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ankt b;
                final jql jqlVar = jql.this;
                final String str2 = str;
                final jfz jfzVar2 = jfzVar;
                final Optional optional4 = optional;
                final Optional optional5 = optional2;
                final Optional optional6 = optional3;
                final jiq jiqVar = (jiq) obj;
                if (jiqVar == jiq.PLAYABLE) {
                    return;
                }
                aqxo.p(jiqVar != jiq.PLAYABLE);
                jfv jfvVar = jqlVar.b;
                if (jfzVar2.a() == agqv.class) {
                    b = jfvVar.a.b(jfzVar2);
                } else if (jfzVar2.a() == awjr.class) {
                    b = jfvVar.b.b(jfzVar2);
                } else if (jfzVar2.a() == asze.class) {
                    b = jfvVar.c.b(jfzVar2);
                } else {
                    String valueOf = String.valueOf(jfzVar2.a());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                    sb.append("CompositeDownloadStateChecker.isDownloadInErrorStateAsync does not have support for ");
                    sb.append(valueOf);
                    throw new UnsupportedOperationException(sb.toString());
                }
                ylx.k(anii.i(anko.q(b), new anir() { // from class: jqg
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        ankt c;
                        jql jqlVar2 = jql.this;
                        jfz jfzVar3 = jfzVar2;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        jfv jfvVar2 = jqlVar2.b;
                        if (jfzVar3.a() == agqv.class) {
                            c = jfvVar2.a.c(jfzVar3);
                        } else if (jfzVar3.a() == awjr.class) {
                            c = jfvVar2.b.c(jfzVar3);
                        } else if (jfzVar3.a() == asze.class) {
                            c = jfvVar2.c.c(jfzVar3);
                        } else {
                            String valueOf2 = String.valueOf(jfzVar3.a());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 81);
                            sb2.append("CompositeDownloadStateChecker.isDownloadRetryableAsync does not have support for ");
                            sb2.append(valueOf2);
                            throw new UnsupportedOperationException(sb2.toString());
                        }
                        return anii.h(anko.q(c), new ehf(booleanValue, 8), jqlVar2.i);
                    }
                }, jqlVar.i), jqlVar.h, jou.d, new ylw() { // from class: jqf
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj2) {
                        final jql jqlVar2 = jql.this;
                        final String str3 = str2;
                        Optional optional7 = optional4;
                        Optional optional8 = optional5;
                        Optional optional9 = optional6;
                        jiq jiqVar2 = jiqVar;
                        jqk jqkVar = (jqk) obj2;
                        if (jqkVar.a) {
                            boolean z = jqkVar.b;
                            if (jiqVar2 != jiq.TRANSFER_PENDING_USER_APPROVAL || !optional9.isPresent() || ((String) optional9.get()).isEmpty()) {
                                if (jiqVar2 == jiq.ERROR_PENDING_PLAYABILITY_ACTION) {
                                    if (!optional7.isPresent()) {
                                        return;
                                    }
                                    asaj asajVar = (asaj) aaqp.c(((atyp) optional7.get()).getPlayerResponseBytes().I(), asaj.a);
                                    if (asajVar == null) {
                                        asajVar = asaj.a;
                                    }
                                    aios aiosVar = jqlVar2.a;
                                    asaa asaaVar = asajVar.f;
                                    if (asaaVar == null) {
                                        asaaVar = asaa.a;
                                    }
                                    aiosVar.k(asaaVar, new jqj(jqlVar2.d, str3, (String) optional9.orElse(null)), str3);
                                    return;
                                } else if (jiqVar2 == jiq.ERROR_STREAMS_MISSING) {
                                    jqlVar2.d.u((String) optional9.orElse(null), str3);
                                    return;
                                } else if (jiqVar2 == jiq.ERROR_EXPIRED) {
                                    if (!optional8.isPresent()) {
                                        return;
                                    }
                                    final atse a = jql.a((atss) optional8.get());
                                    jql.e(a).ifPresent(new Consumer() { // from class: jqh
                                        @Override // j$.util.function.Consumer
                                        public final void accept(Object obj3) {
                                            jql jqlVar3 = jql.this;
                                            atse atseVar = a;
                                            jpo jpoVar = jqlVar3.d;
                                            jpoVar.a.a(ampq.j(obj3), Long.valueOf(atseVar.g), new jpn(jpoVar));
                                        }

                                        @Override // j$.util.function.Consumer
                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return consumer.getClass();
                                        }
                                    });
                                    return;
                                } else if (jiqVar2 == jiq.ERROR_POLICY || jiqVar2 == jiq.ERROR_NOT_PLAYABLE) {
                                    jlm jlmVar = jqlVar2.g;
                                    if (optional8.isPresent()) {
                                        try {
                                            if (jlm.a((atse) aopi.parseFrom(atse.a, ((atss) optional8.get()).getOfflineStateBytes(), aoos.b()))) {
                                                jlmVar.a.c(2);
                                            }
                                        } catch (aopx unused) {
                                            zep.b("Could not parse the OfflineState from the OfflineVideoPolicyEntity to determine if an offline refresh should be scheduled");
                                        }
                                    }
                                    if (!optional8.isPresent()) {
                                        return;
                                    }
                                    jql.e(jql.a((atss) optional8.get())).ifPresent(new Consumer() { // from class: jqi
                                        @Override // j$.util.function.Consumer
                                        public final void accept(Object obj3) {
                                            jql jqlVar3 = jql.this;
                                            jqlVar3.d.r(str3, obj3, jqlVar3.f.oi());
                                        }

                                        @Override // j$.util.function.Consumer
                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return consumer.getClass();
                                        }
                                    });
                                    return;
                                } else if (jiqVar2 == jiq.ERROR_EXPIRED_RENTAL) {
                                    jqlVar2.d.d(str3, true);
                                    return;
                                } else if (z) {
                                    jqlVar2.d.n((String) optional9.orElse(null), str3, null, true);
                                    return;
                                } else {
                                    jqlVar2.d.d(str3, true);
                                    return;
                                }
                            }
                            jqlVar2.c.f((String) optional9.get(), ahbt.a(true));
                        } else if (jiqVar2 != jiq.TRANSFER_IN_PROGRESS && jiqVar2 != jiq.TRANSFER_PAUSED && jiqVar2 != jiq.TRANSFER_WAITING_IN_QUEUE) {
                        } else {
                            jqlVar2.e.d(R.string.offline_click_queued_offline_video_snackbar_text);
                            actj actjVar = actj.OFFLINE_VIDEO_NOT_DOWNLOADED_YET;
                            acti oi = jqlVar2.f.oi();
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
}
