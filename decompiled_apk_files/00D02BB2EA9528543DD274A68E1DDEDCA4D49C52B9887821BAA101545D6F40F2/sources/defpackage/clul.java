package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;
/* compiled from: PG */
/* renamed from: clul  reason: default package */
/* loaded from: classes5.dex */
public final class clul implements clus {
    private static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7};
    private static final Constructor<? extends clun> b;

    static {
        Constructor<? extends clun> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(clun.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        b = constructor;
    }

    private static final void b(int i, List<clun> list) {
        switch (i) {
            case 0:
                list.add(new clyo());
                return;
            case 1:
                list.add(new clyr());
                return;
            case 2:
                list.add(new clyu(null));
                return;
            case 3:
                list.add(new clvr(null));
                return;
            case 4:
                Constructor<? extends clun> constructor = b;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(0));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new clvw(null));
                return;
            case 5:
                list.add(new clvz());
                return;
            case 6:
                list.add(new clwl(null));
                return;
            case 7:
                list.add(new clws(null));
                return;
            case 8:
                list.add(new clxl(null));
                list.add(new clxq(null));
                return;
            case 9:
                list.add(new clyd());
                return;
            case 10:
                list.add(new clzv());
                return;
            case 11:
                list.add(new cmaf(null));
                return;
            case 12:
                list.add(new cmar());
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ac, code lost:
        if (r15 == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ae, code lost:
        b(r15, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0173 A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:101:0x0173, B:102:0x0176, B:182:0x02ae, B:183:0x02b1, B:185:0x02b7, B:188:0x02bd, B:189:0x02c0, B:190:0x02c3, B:105:0x017f, B:107:0x0187, B:110:0x0191, B:113:0x019c, B:115:0x01a4, B:118:0x01ae, B:121:0x01b9, B:124:0x01c4, B:127:0x01cf, B:129:0x01dd, B:132:0x01e7, B:135:0x01f2, B:137:0x01fa, B:139:0x0208, B:141:0x0216, B:144:0x0226, B:146:0x0234, B:149:0x023d, B:151:0x0245, B:153:0x024d, B:155:0x0255, B:158:0x025e, B:160:0x0266, B:163:0x0275, B:165:0x027d, B:168:0x0286, B:170:0x028e, B:12:0x003c, B:13:0x0044, B:85:0x014d, B:15:0x0049, B:18:0x0055, B:21:0x0061, B:24:0x006d, B:27:0x0078, B:30:0x0083, B:33:0x008e, B:36:0x009a, B:39:0x00a6, B:42:0x00b2, B:45:0x00be, B:48:0x00c9, B:51:0x00d4, B:54:0x00df, B:57:0x00eb, B:60:0x00f6, B:63:0x0101, B:66:0x010c, B:69:0x0117, B:72:0x0121, B:75:0x012c, B:78:0x0137, B:81:0x0142), top: B:198:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017f A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:101:0x0173, B:102:0x0176, B:182:0x02ae, B:183:0x02b1, B:185:0x02b7, B:188:0x02bd, B:189:0x02c0, B:190:0x02c3, B:105:0x017f, B:107:0x0187, B:110:0x0191, B:113:0x019c, B:115:0x01a4, B:118:0x01ae, B:121:0x01b9, B:124:0x01c4, B:127:0x01cf, B:129:0x01dd, B:132:0x01e7, B:135:0x01f2, B:137:0x01fa, B:139:0x0208, B:141:0x0216, B:144:0x0226, B:146:0x0234, B:149:0x023d, B:151:0x0245, B:153:0x024d, B:155:0x0255, B:158:0x025e, B:160:0x0266, B:163:0x0275, B:165:0x027d, B:168:0x0286, B:170:0x028e, B:12:0x003c, B:13:0x0044, B:85:0x014d, B:15:0x0049, B:18:0x0055, B:21:0x0061, B:24:0x006d, B:27:0x0078, B:30:0x0083, B:33:0x008e, B:36:0x009a, B:39:0x00a6, B:42:0x00b2, B:45:0x00be, B:48:0x00c9, B:51:0x00d4, B:54:0x00df, B:57:0x00eb, B:60:0x00f6, B:63:0x0101, B:66:0x010c, B:69:0x0117, B:72:0x0121, B:75:0x012c, B:78:0x0137, B:81:0x0142), top: B:198:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b7 A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:101:0x0173, B:102:0x0176, B:182:0x02ae, B:183:0x02b1, B:185:0x02b7, B:188:0x02bd, B:189:0x02c0, B:190:0x02c3, B:105:0x017f, B:107:0x0187, B:110:0x0191, B:113:0x019c, B:115:0x01a4, B:118:0x01ae, B:121:0x01b9, B:124:0x01c4, B:127:0x01cf, B:129:0x01dd, B:132:0x01e7, B:135:0x01f2, B:137:0x01fa, B:139:0x0208, B:141:0x0216, B:144:0x0226, B:146:0x0234, B:149:0x023d, B:151:0x0245, B:153:0x024d, B:155:0x0255, B:158:0x025e, B:160:0x0266, B:163:0x0275, B:165:0x027d, B:168:0x0286, B:170:0x028e, B:12:0x003c, B:13:0x0044, B:85:0x014d, B:15:0x0049, B:18:0x0055, B:21:0x0061, B:24:0x006d, B:27:0x0078, B:30:0x0083, B:33:0x008e, B:36:0x009a, B:39:0x00a6, B:42:0x00b2, B:45:0x00be, B:48:0x00c9, B:51:0x00d4, B:54:0x00df, B:57:0x00eb, B:60:0x00f6, B:63:0x0101, B:66:0x010c, B:69:0x0117, B:72:0x0121, B:75:0x012c, B:78:0x0137, B:81:0x0142), top: B:198:0x0001 }] */
    @Override // defpackage.clus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.clun[] a(android.net.Uri r19, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r20) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clul.a(android.net.Uri, java.util.Map):clun[]");
    }
}
