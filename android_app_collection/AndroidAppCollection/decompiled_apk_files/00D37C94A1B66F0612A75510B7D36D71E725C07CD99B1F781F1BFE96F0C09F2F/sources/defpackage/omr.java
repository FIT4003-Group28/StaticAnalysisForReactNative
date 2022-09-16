package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: omr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class omr implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ omr u = new omr(20);
    public static final /* synthetic */ omr t = new omr(19);
    public static final /* synthetic */ omr s = new omr(18);
    public static final /* synthetic */ omr r = new omr(17);
    public static final /* synthetic */ omr q = new omr(16);
    public static final /* synthetic */ omr p = new omr(15);
    public static final /* synthetic */ omr o = new omr(14);
    public static final /* synthetic */ omr n = new omr(13);
    public static final /* synthetic */ omr m = new omr(12);
    public static final /* synthetic */ omr l = new omr(11);
    public static final /* synthetic */ omr k = new omr(10);
    public static final /* synthetic */ omr j = new omr(9);
    public static final /* synthetic */ omr i = new omr(8);
    public static final /* synthetic */ omr h = new omr(7);
    public static final /* synthetic */ omr g = new omr(6);
    public static final /* synthetic */ omr f = new omr(5);
    public static final /* synthetic */ omr e = new omr(4);
    public static final /* synthetic */ omr d = new omr(3);
    public static final /* synthetic */ omr c = new omr(2);
    public static final /* synthetic */ omr b = new omr(1);
    public static final /* synthetic */ omr a = new omr();

    private /* synthetic */ omr() {
    }

    private /* synthetic */ omr(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((String) obj).split("=");
            case 1:
                return ((String) obj).trim();
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                return sb.toString();
            case 3:
                return (String) ((Map.Entry) obj).getKey();
            case 4:
                return ((String[]) obj)[0];
            case 5:
                return ((String[]) obj)[1];
            case 6:
                return amuk.p(((StreamConfigurationMap) ((CameraCharacteristics) obj).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
            case 7:
                return ((awxe) obj).b;
            case 8:
                return ((awxe) obj).c;
            case 9:
                return ((tpo) obj).c;
            case 10:
                return ((tpo) obj).d;
            case 11:
                avfw avfwVar = (avfw) obj;
                return new ArrayList();
            case 12:
                avkz avkzVar = (avkz) obj;
                return new HashSet();
            case 13:
                String str3 = (String) obj;
                return new HashSet();
            case 14:
                return (String) ((AbstractMap.SimpleEntry) obj).getKey();
            case 15:
                return (awtp) ((AbstractMap.SimpleEntry) obj).getValue();
            case 16:
                Map.Entry entry2 = (Map.Entry) obj;
                long j2 = adao.a;
                aopa mo52toBuilder = ((awtp) entry2.getValue()).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                ((awtp) mo52toBuilder.instance).a().clear();
                mo52toBuilder.copyOnWrite();
                ((awtp) mo52toBuilder.instance).a().putAll((Map) Collection.EL.stream(Collections.unmodifiableMap(((awtp) entry2.getValue()).e).entrySet()).sorted(utr.i).limit(1000L).collect(Collectors.toMap(r, s)));
                return new AbstractMap.SimpleEntry((String) entry2.getKey(), (awtp) mo52toBuilder.mo39build());
            case 17:
                return (String) ((Map.Entry) obj).getKey();
            case 18:
                return (awtt) ((Map.Entry) obj).getValue();
            case 19:
                bhc bhcVar = (bhc) obj;
                String str4 = adgj.a;
                return bhcVar;
            default:
                ankt anktVar = (ankt) obj;
                String str5 = adgj.a;
                try {
                    return (Pair) anlz.y(anktVar);
                } catch (ExecutionException e2) {
                    String str6 = adgj.a;
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51);
                    sb2.append("Future to get CastDevice from route bundle failed: ");
                    sb2.append(valueOf);
                    zep.c(str6, sb2.toString());
                    return null;
                }
        }
    }
}
