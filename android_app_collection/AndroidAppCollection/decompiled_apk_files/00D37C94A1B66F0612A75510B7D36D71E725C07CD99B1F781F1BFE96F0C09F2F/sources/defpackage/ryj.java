package defpackage;

import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.utils.FaceViewerCompatibilityChecker;
/* compiled from: PG */
/* renamed from: ryj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ryj implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ryj u = new ryj(20);
    public static final /* synthetic */ ryj t = new ryj(19);
    public static final /* synthetic */ ryj s = new ryj(18);
    public static final /* synthetic */ ryj r = new ryj(17);
    public static final /* synthetic */ ryj q = new ryj(16);
    public static final /* synthetic */ ryj p = new ryj(15);
    public static final /* synthetic */ ryj o = new ryj(14);
    public static final /* synthetic */ ryj n = new ryj(13);
    public static final /* synthetic */ ryj m = new ryj(12);
    public static final /* synthetic */ ryj l = new ryj(11);
    public static final /* synthetic */ ryj k = new ryj(10);
    public static final /* synthetic */ ryj j = new ryj(9);
    public static final /* synthetic */ ryj i = new ryj(8);
    public static final /* synthetic */ ryj h = new ryj(7);
    public static final /* synthetic */ ryj g = new ryj(6);
    public static final /* synthetic */ ryj f = new ryj(5);
    public static final /* synthetic */ ryj e = new ryj(4);
    public static final /* synthetic */ ryj d = new ryj(3);
    public static final /* synthetic */ ryj c = new ryj(2);
    public static final /* synthetic */ ryj b = new ryj(1);
    public static final /* synthetic */ ryj a = new ryj();

    private /* synthetic */ ryj() {
    }

    private /* synthetic */ ryj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.v) {
            case 0:
                return rxw.a((String) obj);
            case 1:
                return ((rxx) obj).toString();
            case 2:
                return rxx.a((String) obj);
            case 3:
                return Uri.parse((String) obj).buildUpon().appendQueryParameter("result_channel", ryu.af).build().toString();
            case 4:
                int i2 = ryy.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 5:
                ampq ampqVar = (ampq) obj;
                if (!ampqVar.h()) {
                    return amon.a;
                }
                aofi aofiVar = (aofi) ampqVar.c();
                rzb rzbVar = new rzb();
                aofiVar.b.getClass();
                String str = aofiVar.d;
                str.getClass();
                rzbVar.a = str;
                aofz aofzVar = aofiVar.c;
                if (aofzVar == null) {
                    aofzVar = aofz.a;
                }
                rzbVar.b = aofzVar.b;
                aofz aofzVar2 = aofiVar.c;
                if (aofzVar2 == null) {
                    aofzVar2 = aofz.a;
                }
                rzbVar.c = aofzVar2.c;
                return ampq.j(new rzc(rzbVar));
            case 6:
                aofc aofcVar = (aofc) obj;
                return null;
            case 7:
                return ampq.j((aofi) obj);
            case 8:
                amzy amzyVar = shx.a;
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.valueOf(FaceViewerCompatibilityChecker.nativeIsGpuInferenceSupported());
                }
                return false;
            case 9:
                ExperienceJni experienceJni = ((sja) obj).a;
                try {
                    return (awgg) ((aopa) awgg.a.createBuilder().mo38mergeFrom(experienceJni.nativeGetWebConfigProto(experienceJni.b), aoos.b())).mo39build();
                } catch (aopx e2) {
                    ((amzw) ((amzw) ((amzw) ExperienceJni.a.f()).h(e2)).i("com/google/android/libraries/ar/faceviewer/runtime/ExperienceJni", "getWebConfigProto", (char) 24, "ExperienceJni.java")).q("Error parsing WeebConfig.");
                    return null;
                }
            case 10:
                slh slhVar = (slh) obj;
                if (slhVar != null) {
                    ((amzw) ((amzw) slh.a.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isGrpcSupported", 94, "AssistantConfig.java")).s("#grpcEligible() - grpcEligible = %s", slhVar.d);
                    if (((Boolean) slhVar.d.e(false)).booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                return Integer.valueOf(((aopm) obj).getNumber());
            case 12:
                return ((amuf) obj).g();
            case 13:
                return (tpp) ((aopa) obj).mo39build();
            case 14:
                tpp tppVar = (tpp) obj;
                tppVar.getClass();
                return tppVar;
            case 15:
                tqa tqaVar = (tqa) obj;
                return null;
            case 16:
                Boolean bool = (Boolean) obj;
                return null;
            case 17:
                return tzb.a(obj);
            case 18:
                return tzb.b((Exception) obj);
            case 19:
                return tzb.a(obj);
            default:
                return tzb.b((Exception) obj);
        }
    }
}
