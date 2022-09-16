package defpackage;

import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fnv  reason: default package */
/* loaded from: classes3.dex */
public final class fnv implements afzf {
    final /* synthetic */ fnx a;
    private final apzg b;
    private final Map c;
    private final agcu d;
    private final hxb e;

    public fnv(fnx fnxVar, apzg apzgVar, hxb hxbVar, Map map, agcu agcuVar, byte[] bArr, byte[] bArr2) {
        this.a = fnxVar;
        this.b = apzgVar;
        this.e = hxbVar;
        this.c = map;
        this.d = agcuVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error rating", cffVar);
        this.a.b.e(cffVar);
        ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) this.b.qm(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g.size() > 0) {
            ((aafo) this.a.a.get()).e(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g, this.d);
        }
        this.e.a();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        apos aposVar;
        avbl avblVar;
        acti actiVar;
        aryf aryfVar = (aryf) obj;
        Map map = this.c;
        avbh avbhVar = null;
        if (map != null && (aryfVar.b & 128) != 0 && (actiVar = (acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class)) != null) {
            actiVar.D(new acte(aryfVar.i.I()));
            actiVar.u(new acte(aryfVar.i.I()), null);
        }
        ((aafo) this.a.a.get()).d(aryfVar.d, this.c);
        ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) this.b.qm(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((aafo) this.a.a.get()).d(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.e, this.c);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.f.size() > 0) {
            ((aafo) this.a.a.get()).e(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.f, this.d);
        }
        apok apokVar = aryfVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 2) != 0) {
            apok apokVar2 = aryfVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            aposVar = apokVar2.d;
            if (aposVar == null) {
                aposVar = apos.a;
            }
        } else {
            aposVar = null;
        }
        arxz arxzVar = aryfVar.f;
        if (arxzVar == null) {
            arxzVar = arxz.a;
        }
        if (arxzVar.b == 119226798) {
            arxz arxzVar2 = aryfVar.f;
            if (arxzVar2 == null) {
                arxzVar2 = arxz.a;
            }
            if (arxzVar2.b == 119226798) {
                avblVar = (avbl) arxzVar2.c;
            } else {
                avblVar = avbl.a;
            }
        } else {
            avblVar = null;
        }
        arxz arxzVar3 = aryfVar.f;
        if (arxzVar3 == null) {
            arxzVar3 = arxz.a;
        }
        if (arxzVar3.b == 136076983) {
            arxz arxzVar4 = aryfVar.f;
            if (arxzVar4 == null) {
                arxzVar4 = arxz.a;
            }
            if (arxzVar4.b == 136076983) {
                avbhVar = (avbh) arxzVar4.c;
            } else {
                avbhVar = avbh.a;
            }
        }
        if (!aryfVar.g.isEmpty()) {
            iip c = iiq.c(aryfVar.g);
            c.f = aposVar;
            c.e = avblVar;
            c.d = avbhVar;
            boolean z = true;
            c.e(true);
            c.d(aryfVar.h);
            iiq a = c.a();
            this.a.c.c(a.b, a);
            iis iisVar = (iis) this.a.c.b(iis.b(aryfVar.g, true));
            if (iisVar != null) {
                if (avblVar != null) {
                    aopa mo52toBuilder = ((aopi) iisVar.a).mo52toBuilder();
                    int size = ((apsm) mo52toBuilder.instance).m.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            if ((mo52toBuilder.Y(size).b & 4) != 0) {
                                aopa createBuilder = apsj.a.createBuilder();
                                createBuilder.copyOnWrite();
                                apsj apsjVar = (apsj) createBuilder.instance;
                                apsjVar.e = avblVar;
                                apsjVar.b |= 4;
                                mo52toBuilder.Z(size, createBuilder);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    iis.c(mo52toBuilder);
                    iisVar = new iis((apsm) mo52toBuilder.mo39build(), iisVar.c);
                } else if (avbhVar != null) {
                    aopa mo52toBuilder2 = ((aopi) iisVar.a).mo52toBuilder();
                    int size2 = ((apsm) mo52toBuilder2.instance).m.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            if ((mo52toBuilder2.Y(size2).b & 8) != 0) {
                                aopa createBuilder2 = apsj.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                apsj apsjVar2 = (apsj) createBuilder2.instance;
                                apsjVar2.f = avbhVar;
                                apsjVar2.b |= 8;
                                mo52toBuilder2.Z(size2, createBuilder2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    iis.c(mo52toBuilder2);
                    iisVar = new iis((apsm) mo52toBuilder2.mo39build(), iisVar.c);
                } else {
                    z = false;
                }
                if (z) {
                    this.a.c.c(iisVar.b, iisVar);
                }
            }
        }
        this.e.b(aposVar);
    }
}
