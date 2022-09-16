package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.UpdateCommentEndpointOuterClass$UpdateCommentEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xos  reason: default package */
/* loaded from: classes4.dex */
public final class xos implements aafl {
    public static final /* synthetic */ int b = 0;
    public final xko a;
    private final aavc c;
    private final acth d;
    private final dt e;
    private final Executor f;
    private final /* synthetic */ int g;

    public xos(aavc aavcVar, xko xkoVar, acth acthVar, dt dtVar, Executor executor, int i) {
        this.g = i;
        aavcVar.getClass();
        this.c = aavcVar;
        xkoVar.getClass();
        this.a = xkoVar;
        this.d = acthVar;
        this.e = dtVar;
        this.f = executor;
    }

    private final acti b() {
        return this.d.oi();
    }

    private final acti c() {
        return this.d.oi();
    }

    public xos(aavc aavcVar, xko xkoVar, acth acthVar, dt dtVar, Executor executor) {
        aavcVar.getClass();
        this.c = aavcVar;
        xkoVar.getClass();
        this.a = xkoVar;
        this.d = acthVar;
        this.e = dtVar;
        this.f = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int i = 0;
        if (this.g == 0) {
            final xnr xnrVar = (xnr) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xnr.class);
            if (xnrVar == null || !TextUtils.isEmpty(xnrVar.b())) {
                aavc aavcVar = this.c;
                aavj aavjVar = new aavj(aavcVar.e, aavcVar.a.c());
                UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint = (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint) apzgVar.qm(UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.updateCommentReplyEndpoint);
                aavjVar.a = aavj.g(updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.b);
                aavjVar.j(aafx.a(apzgVar));
                if (apzgVar.qn(auqs.b)) {
                    auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
                    if (!auqrVar.c.isEmpty()) {
                        aavjVar.l(auqrVar.c);
                    }
                }
                if (xnrVar != null) {
                    aavjVar.t(xnrVar.b());
                } else if (updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.d) {
                    arag aragVar = updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i < aragVar.c.size()) {
                        sb.append(((arai) aragVar.c.get(i)).c);
                        i++;
                    }
                    aavjVar.t(sb.toString());
                    if (b() != null) {
                        b().H(3, new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON), null);
                    }
                }
                ylx.n(this.e, this.c.i.b(aavjVar, this.f), new zdt() { // from class: xoq
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        xnr xnrVar2 = xnr.this;
                        Throwable th = (Throwable) obj;
                        int i2 = xos.b;
                        if (xnrVar2 != null) {
                            xnrVar2.e((cff) th);
                        }
                    }
                }, new zdt() { // from class: xor
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        arnh arnhVar;
                        xos xosVar = xos.this;
                        xnr xnrVar2 = xnrVar;
                        arod arodVar = (arod) obj;
                        if (xnrVar2 != null) {
                            xnrVar2.f(arodVar);
                            return;
                        }
                        xko xkoVar = xosVar.a;
                        if ((arodVar.b & 8) != 0) {
                            arnhVar = arodVar.g;
                            if (arnhVar == null) {
                                arnhVar = arnh.a;
                            }
                        } else {
                            arnhVar = null;
                        }
                        xkoVar.a(arnhVar, null);
                    }
                });
                return;
            }
            xnrVar.e(null);
            return;
        }
        final xns xnsVar = (xns) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xns.class);
        aavc aavcVar2 = this.c;
        aavk aavkVar = new aavk(aavcVar2.e, aavcVar2.a.c());
        UpdateCommentEndpointOuterClass$UpdateCommentEndpoint updateCommentEndpointOuterClass$UpdateCommentEndpoint = (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint) apzgVar.qm(UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.updateCommentEndpoint);
        aavkVar.a = aavk.g(updateCommentEndpointOuterClass$UpdateCommentEndpoint.b);
        aavkVar.j(aafx.a(apzgVar));
        boolean z = map.containsKey("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key") && ((Boolean) map.get("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key")).booleanValue();
        if (xnsVar != null) {
            aavkVar.t(xnsVar.b(), z);
            aavkVar.b = xnsVar.a();
        } else if (updateCommentEndpointOuterClass$UpdateCommentEndpoint.d) {
            arag aragVar2 = updateCommentEndpointOuterClass$UpdateCommentEndpoint.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            StringBuilder sb2 = new StringBuilder();
            while (i < aragVar2.c.size()) {
                sb2.append(((arai) aragVar2.c.get(i)).c);
                i++;
            }
            aavkVar.t(sb2.toString(), z);
            if (c() != null) {
                c().H(3, new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON), null);
            }
        }
        ylx.n(this.e, this.c.h.b(aavkVar, this.f), new zdt() { // from class: xon
            @Override // defpackage.zdt
            public final void a(Object obj) {
                xns xnsVar2 = xns.this;
                Throwable th = (Throwable) obj;
                int i2 = xos.b;
                if (xnsVar2 != null) {
                    xnsVar2.c((cff) th);
                }
            }
        }, new zdt(xnsVar, null) { // from class: xoo
            public final /* synthetic */ xns a;

            @Override // defpackage.zdt
            public final void a(Object obj) {
                arnh arnhVar;
                xos xosVar = xos.this;
                xns xnsVar2 = this.a;
                arog arogVar = (arog) obj;
                if (xnsVar2 != null) {
                    xnsVar2.d(arogVar);
                    return;
                }
                xko xkoVar = xosVar.a;
                if ((arogVar.b & 4) != 0) {
                    arnhVar = arogVar.f;
                    if (arnhVar == null) {
                        arnhVar = arnh.a;
                    }
                } else {
                    arnhVar = null;
                }
                xkoVar.a(arnhVar, null);
            }
        });
    }
}
