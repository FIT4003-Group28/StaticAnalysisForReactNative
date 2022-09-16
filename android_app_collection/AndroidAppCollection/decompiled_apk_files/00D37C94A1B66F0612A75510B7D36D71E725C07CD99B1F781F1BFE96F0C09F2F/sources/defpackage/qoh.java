package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: qoh  reason: default package */
/* loaded from: classes4.dex */
public final class qoh implements qjh {
    public final Object a;
    public final qpy b;
    public final List c = new CopyOnWriteArrayList();
    public final List d = new CopyOnWriteArrayList();
    public final Map e;
    private final Handler f;
    private final qny g;
    private final qnl h;
    private qjj i;

    static {
        String str = qpy.e;
    }

    public qoh(qpy qpyVar) {
        new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.a = new Object();
        this.f = new rfm(Looper.getMainLooper());
        qny qnyVar = new qny(this);
        this.g = qnyVar;
        this.b = qpyVar;
        qpyVar.E = new qog(this);
        qpyVar.c = qnyVar;
        if (qpyVar.c == null) {
            qpyVar.b();
        }
        this.h = new qnl(this);
    }

    public static final void u(qod qodVar) {
        try {
            if (!qodVar.c) {
                for (qoa qoaVar : qodVar.d.c) {
                    qoaVar.e();
                }
                for (tqj tqjVar : qodVar.d.d) {
                }
            }
            try {
                synchronized (qodVar.d.a) {
                    qodVar.b();
                }
            } catch (qpx unused) {
                qodVar.n(qod.d(new Status(2100)));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused2) {
            qodVar.n(qod.d(new Status(2100)));
        }
    }

    public static final qta v() {
        qnz qnzVar = new qnz();
        qnzVar.n(qnz.b(new Status(17, null)));
        return qnzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f9 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0316 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0326 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033d A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0344 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034b A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0352 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038d A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:41:0x0099, B:44:0x00a4, B:46:0x00ac, B:48:0x00b4, B:50:0x00ba, B:52:0x00cb, B:54:0x00d7, B:55:0x00e4, B:57:0x00ea, B:58:0x00fb, B:59:0x0105, B:61:0x010b, B:62:0x0115, B:64:0x0121, B:66:0x0135, B:88:0x0171, B:90:0x0186, B:91:0x01a6, B:93:0x01ac, B:94:0x01b6, B:96:0x01bc, B:97:0x01c6, B:99:0x01cc, B:100:0x01d6, B:101:0x01e0, B:103:0x01e6, B:104:0x01f0, B:105:0x01fa, B:107:0x0200, B:108:0x020a, B:110:0x0216, B:112:0x0220, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0240, B:120:0x0244, B:121:0x0251, B:123:0x0257, B:124:0x025e, B:125:0x026d, B:127:0x0273, B:128:0x0283, B:130:0x028f, B:132:0x0299, B:133:0x02a8, B:135:0x02ae, B:136:0x02bc, B:138:0x02c8, B:140:0x02da, B:151:0x02f9, B:154:0x02fe, B:156:0x0312, B:158:0x0316, B:159:0x0322, B:161:0x0326, B:162:0x032f, B:164:0x0333, B:165:0x0339, B:167:0x033d, B:168:0x0340, B:170:0x0344, B:171:0x0347, B:173:0x034b, B:174:0x034e, B:176:0x0352, B:178:0x035c, B:179:0x0364, B:181:0x036a, B:182:0x0374, B:183:0x037c, B:185:0x0382, B:186:0x0389, B:188:0x038d, B:190:0x03a6, B:191:0x03ac, B:193:0x03b2, B:155:0x0303, B:144:0x02e5, B:146:0x02ed, B:189:0x0397), top: B:199:0x000d }] */
    @Override // defpackage.qjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoh.a(java.lang.String, java.lang.String):void");
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            qnm.g("Must be called from the main thread.");
            MediaStatus e = e();
            i = e != null ? e.e : 1;
        }
        return i;
    }

    public final long c() {
        long j;
        MediaStatus mediaStatus;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        synchronized (this.a) {
            qnm.g("Must be called from the main thread.");
            qpy qpyVar = this.b;
            MediaInfo h = qpyVar.h();
            j = 0;
            if (h != null && (mediaStatus = qpyVar.g) != null) {
                Long l = qpyVar.h;
                if (l != null) {
                    if (l.equals(4294967296000L)) {
                        if (qpyVar.g.u != null) {
                            long longValue = l.longValue();
                            MediaStatus mediaStatus2 = qpyVar.g;
                            if (mediaStatus2 != null && (mediaLiveSeekableRange = mediaStatus2.u) != null) {
                                long j2 = mediaLiveSeekableRange.b;
                                j = !mediaLiveSeekableRange.d ? qpyVar.e(1.0d, j2, -1L) : j2;
                            }
                            j = Math.min(longValue, j);
                        } else if (qpyVar.g() >= 0) {
                            j = Math.min(l.longValue(), qpyVar.g());
                        }
                    }
                    j = l.longValue();
                } else if (qpyVar.f != 0) {
                    double d = mediaStatus.d;
                    long j3 = mediaStatus.g;
                    int i = mediaStatus.e;
                    if (d != 0.0d && i == 2) {
                        j = qpyVar.e(d, j3, h.e);
                    }
                    j = j3;
                }
            }
        }
        return j;
    }

    public final MediaInfo d() {
        MediaInfo h;
        synchronized (this.a) {
            qnm.g("Must be called from the main thread.");
            h = this.b.h();
        }
        return h;
    }

    public final MediaStatus e() {
        MediaStatus mediaStatus;
        synchronized (this.a) {
            qnm.g("Must be called from the main thread.");
            mediaStatus = this.b.g;
        }
        return mediaStatus;
    }

    public final qta f() {
        qnm.g("Must be called from the main thread.");
        if (!l()) {
            return v();
        }
        qnt qntVar = new qnt(this);
        u(qntVar);
        return qntVar;
    }

    public final qta g() {
        qnm.g("Must be called from the main thread.");
        if (!l()) {
            return v();
        }
        qnu qnuVar = new qnu(this);
        u(qnuVar);
        return qnuVar;
    }

    public final String h() {
        qnm.g("Must be called from the main thread.");
        return this.b.b;
    }

    public final void i() {
        qjj qjjVar = this.i;
        if (qjjVar == null) {
            return;
        }
        qjjVar.c(h(), this);
        qnm.g("Must be called from the main thread.");
        if (!l()) {
            v();
        } else {
            u(new qno(this));
        }
    }

    public final void j(qjj qjjVar) {
        qjh qjhVar;
        qjj qjjVar2 = this.i;
        if (qjjVar2 == qjjVar) {
            return;
        }
        if (qjjVar2 != null) {
            this.b.b();
            this.h.b();
            String h = h();
            if (!TextUtils.isEmpty(h)) {
                qjz qjzVar = (qjz) qjjVar2;
                synchronized (qjzVar.s) {
                    qjhVar = (qjh) ((qjz) qjjVar2).s.remove(h);
                }
                qvx b = qvy.b();
                b.a = new qjq(qjzVar, qjhVar, h, 1);
                b.c = 8414;
                ((qst) qjjVar2).v(b.a());
                this.g.a = null;
                this.f.removeCallbacksAndMessages(null);
            } else {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
        }
        this.i = qjjVar;
        if (qjjVar == null) {
            return;
        }
        this.g.a = qjjVar;
    }

    public final void k() {
        qnm.g("Must be called from the main thread.");
        int b = b();
        if (b == 4 || b == 2) {
            f();
        } else {
            g();
        }
    }

    public final boolean l() {
        return this.i != null;
    }

    public final boolean m() {
        qnm.g("Must be called from the main thread.");
        if (!n()) {
            qnm.g("Must be called from the main thread.");
            MediaStatus e = e();
            return (e != null && e.e == 5) || r() || q() || p();
        }
        return true;
    }

    public final boolean n() {
        qnm.g("Must be called from the main thread.");
        MediaStatus e = e();
        return e != null && e.e == 4;
    }

    public final boolean o() {
        qnm.g("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean p() {
        qnm.g("Must be called from the main thread.");
        MediaStatus e = e();
        return (e == null || e.l == 0) ? false : true;
    }

    public final boolean q() {
        int i;
        qnm.g("Must be called from the main thread.");
        MediaStatus e = e();
        if (e != null) {
            if (e.e == 3) {
                return true;
            }
            if (o()) {
                synchronized (this.a) {
                    qnm.g("Must be called from the main thread.");
                    MediaStatus e2 = e();
                    i = e2 != null ? e2.f : 0;
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r() {
        qnm.g("Must be called from the main thread.");
        MediaStatus e = e();
        return e != null && e.e == 2;
    }

    public final boolean s() {
        qnm.g("Must be called from the main thread.");
        MediaStatus e = e();
        return e != null && e.r;
    }

    public final void t(qke qkeVar) {
        qnm.g("Must be called from the main thread.");
        if (!l()) {
            v();
        } else {
            u(new qnv(this, qkeVar));
        }
    }
}
