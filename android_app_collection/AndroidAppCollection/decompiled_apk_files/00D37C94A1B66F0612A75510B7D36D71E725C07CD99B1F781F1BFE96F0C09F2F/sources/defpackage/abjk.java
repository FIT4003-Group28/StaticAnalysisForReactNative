package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatActionEndpointOuterClass$LiveChatActionEndpoint;
import com.google.protos.youtube.api.innertube.ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
import com.google.protos.youtube.api.innertube.SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abjk  reason: default package */
/* loaded from: classes.dex */
public final class abjk implements aafl {
    public final abha a;
    public final yzj b;
    public final Executor c;
    private final aaza d;
    private final /* synthetic */ int e;

    public abjk(aaza aazaVar, abha abhaVar, yzj yzjVar, Executor executor, int i) {
        this.e = i;
        aazaVar.getClass();
        this.d = aazaVar;
        abhaVar.getClass();
        this.a = abhaVar;
        yzjVar.getClass();
        this.b = yzjVar;
        this.c = executor;
    }

    public abjk(aaza aazaVar, abha abhaVar, yzj yzjVar, Executor executor) {
        aazaVar.getClass();
        this.d = aazaVar;
        abhaVar.getClass();
        this.a = abhaVar;
        yzjVar.getClass();
        this.b = yzjVar;
        this.c = executor;
    }

    public abjk(aaza aazaVar, abha abhaVar, yzj yzjVar, Executor executor, int i, byte[] bArr) {
        this.e = i;
        aazaVar.getClass();
        this.d = aazaVar;
        abhaVar.getClass();
        this.a = abhaVar;
        yzjVar.getClass();
        this.b = yzjVar;
        this.c = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        int i = this.e;
        if (i == 0) {
            aaza aazaVar = this.d;
            aazb aazbVar = new aazb(aazaVar.e, aazaVar.a.c());
            aazbVar.a = ((ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint) apzgVar.qm(ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.manageLiveChatUserEndpoint)).b;
            aazbVar.j(apzgVar.c);
            ylx.k(aazaVar.h.b(aazbVar, anjk.a), this.c, new gmb(this.b, 4), new ylw() { // from class: abjj
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    abgz abgzVar;
                    abjk abjkVar = abjk.this;
                    Map map2 = map;
                    arwn arwnVar = (arwn) obj;
                    if (arwnVar.c.size() > 0) {
                        Object obj2 = map2.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                        if (obj2 instanceof abjh) {
                            abgzVar = ((abjh) obj2).a();
                        } else {
                            abgzVar = obj2 instanceof abgz ? (abgz) obj2 : null;
                        }
                        if (abgzVar == null) {
                            String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                            afus.b(2, 31, valueOf.length() != 0 ? "Moderate live chat command called with no context. \n".concat(valueOf) : new String("Moderate live chat command called with no context. \n"));
                            return;
                        }
                        abjkVar.a.a(arwnVar.c, abgzVar, true);
                    }
                }
            });
        } else if (i == 1) {
            aaza aazaVar2 = this.d;
            aayt aaytVar = new aayt(aazaVar2.e, aazaVar2.a.c());
            aaytVar.a = ((LiveChatActionEndpointOuterClass$LiveChatActionEndpoint) apzgVar.qm(LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.liveChatActionEndpoint)).b;
            aaytVar.j(apzgVar.c);
            ylx.k(aazaVar2.i.b(aaytVar, anjk.a), this.c, new gmb(this.b, 3), new ylw(map, null) { // from class: abjg
                public final /* synthetic */ Map a;

                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    abgz abgzVar;
                    abjk abjkVar = abjk.this;
                    Map map2 = this.a;
                    arvp arvpVar = (arvp) obj;
                    if (arvpVar.c.size() > 0) {
                        Object obj2 = map2.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
                        if (obj2 instanceof abjh) {
                            abgzVar = ((abjh) obj2).a();
                        } else {
                            abgzVar = obj2 instanceof abgz ? (abgz) obj2 : null;
                        }
                        if (abgzVar == null) {
                            String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                            afus.b(2, 31, valueOf.length() != 0 ? "Live chat action command called with no context. \n".concat(valueOf) : new String("Live chat action command called with no context. \n"));
                            return;
                        }
                        abjkVar.a.a(arvpVar.c, abgzVar, true);
                    }
                }
            });
        } else {
            aaza aazaVar3 = this.d;
            aaze aazeVar = new aaze(aazaVar3.e, aazaVar3.a.c());
            aazeVar.a = ((SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint) apzgVar.qm(SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.sendLiveChatVoteEndpoint)).b;
            aazeVar.j(apzgVar.c);
            ylx.k(aazaVar3.j.b(aazeVar, anjk.a), this.c, new ylv(map, null) { // from class: abjp
                public final /* synthetic */ Map a;

                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(final Throwable th) {
                    final abjk abjkVar = abjk.this;
                    final Map map2 = this.a;
                    abjkVar.c.execute(new Runnable(map2, th, null) { // from class: abjr
                        public final /* synthetic */ Map a;
                        public final /* synthetic */ Throwable b;

                        @Override // java.lang.Runnable
                        public final void run() {
                            abjk abjkVar2 = abjk.this;
                            Map map3 = this.a;
                            Throwable th2 = this.b;
                            if (map3 == null || !map3.containsKey("live_chat_poll_error_listener_key")) {
                                return;
                            }
                            Object obj = map3.get("live_chat_poll_error_listener_key");
                            if (!(obj instanceof abhj)) {
                                return;
                            }
                            ((abhj) obj).a(abjkVar2.b.b(th2));
                        }
                    });
                }
            }, new ylw(map, null) { // from class: abjq
                public final /* synthetic */ Map a;

                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    abjk abjkVar = abjk.this;
                    Map map2 = this.a;
                    arvw arvwVar = (arvw) obj;
                    if (arvwVar.c.size() > 0) {
                        abgz abgzVar = (abgz) zew.K(map2, "com.google.android.libraries.youtube.innertube.endpoint.tag", abgz.class);
                        if (abgzVar == null) {
                            String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                            afus.b(2, 31, valueOf.length() != 0 ? "Moderate live chat command called with no context. \n".concat(valueOf) : new String("Moderate live chat command called with no context. \n"));
                            return;
                        }
                        abjkVar.a.a(arvwVar.c, abgzVar, true);
                    }
                }
            });
        }
    }
}
