package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import android.net.Uri;
import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import io.grpc.Status;
import java.io.IOException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements anir {
    private final /* synthetic */ int q;
    public static final /* synthetic */ g p = new g(19);
    public static final /* synthetic */ g o = new g(14);
    public static final /* synthetic */ g n = new g(13);
    public static final /* synthetic */ g m = new g(12);
    public static final /* synthetic */ g l = new g(11);
    public static final /* synthetic */ g k = new g(10);
    public static final /* synthetic */ g j = new g(9);
    public static final /* synthetic */ g i = new g(8);
    public static final /* synthetic */ g h = new g(7);
    public static final /* synthetic */ g g = new g(6);
    public static final /* synthetic */ g f = new g(5);
    public static final /* synthetic */ g e = new g(4);
    public static final /* synthetic */ g d = new g(3);
    public static final /* synthetic */ g c = new g(2);
    public static final /* synthetic */ g b = new g(1);
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    public /* synthetic */ g(int i2) {
        this.q = i2;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        Object obj2;
        switch (this.q) {
            case 0:
                cfb cfbVar = (cfb) obj;
                if (cfbVar == null || (obj2 = cfbVar.a) == null) {
                    return anlz.p(new IllegalStateException("Response was null. This should not have happened."));
                }
                cff cffVar = cfbVar.c;
                if (cffVar != null) {
                    return anlz.p(cffVar);
                }
                return anlz.q((aotu) obj2);
            case 1:
                if (((asya) obj) != null) {
                    return anlz.q(agru.a);
                }
                return anlz.q(agru.b);
            case 2:
                Throwable th = (Throwable) obj;
                Status g2 = sbs.g(th);
                if (g2 == null || (g2.getCode() != Status.Code.NOT_FOUND && g2.getCode() != Status.Code.ABORTED)) {
                    throw sbs.f(th);
                }
                return anlz.q(amon.a);
            case 3:
                throw sbs.f((Throwable) obj);
            case 4:
                final sja sjaVar = (sja) obj;
                return aed.c(new agr() { // from class: siy
                    @Override // defpackage.agr
                    public final Object a(agp agpVar) {
                        ExperienceJni experienceJni = sja.this.a;
                        experienceJni.nativePreloadAllItems(experienceJni.b, NativeCallback.a(siu.a(agpVar)));
                        return "Experience.preloadAllItems";
                    }
                });
            case 5:
                qsp qspVar = (qsp) obj;
                int a2 = qspVar.a();
                if (a2 == 17 || a2 == 31003) {
                    return ankq.a;
                }
                throw qspVar;
            case 6:
                tpy a3 = tqa.a();
                a3.a = tpz.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                a3.c = (IOException) obj;
                return anlz.p(a3.a());
            case 7:
                Boolean bool = (Boolean) obj;
                return ankq.a;
            case 8:
                Boolean bool2 = (Boolean) obj;
                return ankq.a;
            case 9:
                Boolean bool3 = (Boolean) obj;
                return ankq.a;
            case 10:
                tqm tqmVar = (tqm) obj;
                if (tqmVar == null) {
                    tqmVar = tqm.a;
                }
                return anlz.q(tqmVar);
            case 11:
                tqu a4 = tqu.a(((tqz) obj).d);
                if (a4 == null) {
                    a4 = tqu.NONE;
                }
                return anlz.q(a4);
            case 12:
                tww twwVar = new tww();
                if (!((Boolean) obj).booleanValue()) {
                    throw new IOException("failed to save sharedFilesMetadata", twwVar);
                }
                throw twwVar;
            case 13:
                tww twwVar2 = (tww) obj;
                return anlz.q(null);
            case 14:
                Uri uri = (Uri) obj;
                return anlz.p(new IllegalStateException());
            case 15:
                throw ((Exception) obj);
            case 16:
                throw ((Exception) obj);
            case 17:
                throw ((Exception) obj);
            case 18:
                throw ((Exception) obj);
            case 19:
                return anlz.q((aogp) aopi.parseFrom(aogp.a, (byte[]) obj, aoos.a()));
            default:
                return anlz.q((amuk) obj);
        }
    }
}
