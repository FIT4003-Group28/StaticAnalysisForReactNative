package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahri  reason: default package */
/* loaded from: classes.dex */
public final class ahri implements SensorEventListener {
    final /* synthetic */ ahrl a;

    public ahri(ahrl ahrlVar) {
        this.a = ahrlVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        synchronized (this.a.b) {
            ahrl ahrlVar = this.a;
            if (sensor == ahrlVar.v) {
                if (ahrlVar.q.c && ahrlVar.p != null) {
                    i = ahkk.a((int) ahrlVar.a());
                }
                ahrm ahrmVar = this.a.c;
                ahrmVar.f = i;
                ahrmVar.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x028f A[Catch: all -> 0x0449, TryCatch #4 {all -> 0x0449, blocks: (B:188:0x0387, B:190:0x038d, B:193:0x0397, B:195:0x03af, B:197:0x03b7, B:138:0x024d, B:140:0x0257, B:144:0x0285, B:146:0x028f, B:147:0x0295, B:149:0x02aa, B:152:0x02bb, B:154:0x02c3, B:156:0x02e0, B:158:0x02ec, B:160:0x02f7, B:162:0x02ff, B:165:0x030c, B:166:0x0314, B:168:0x031e, B:170:0x0323, B:173:0x0330, B:183:0x034c, B:187:0x035a, B:171:0x0327, B:155:0x02dc, B:142:0x025f), top: B:331:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02aa A[Catch: all -> 0x0449, TryCatch #4 {all -> 0x0449, blocks: (B:188:0x0387, B:190:0x038d, B:193:0x0397, B:195:0x03af, B:197:0x03b7, B:138:0x024d, B:140:0x0257, B:144:0x0285, B:146:0x028f, B:147:0x0295, B:149:0x02aa, B:152:0x02bb, B:154:0x02c3, B:156:0x02e0, B:158:0x02ec, B:160:0x02f7, B:162:0x02ff, B:165:0x030c, B:166:0x0314, B:168:0x031e, B:170:0x0323, B:173:0x0330, B:183:0x034c, B:187:0x035a, B:171:0x0327, B:155:0x02dc, B:142:0x025f), top: B:331:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f7 A[Catch: all -> 0x0449, TryCatch #4 {all -> 0x0449, blocks: (B:188:0x0387, B:190:0x038d, B:193:0x0397, B:195:0x03af, B:197:0x03b7, B:138:0x024d, B:140:0x0257, B:144:0x0285, B:146:0x028f, B:147:0x0295, B:149:0x02aa, B:152:0x02bb, B:154:0x02c3, B:156:0x02e0, B:158:0x02ec, B:160:0x02f7, B:162:0x02ff, B:165:0x030c, B:166:0x0314, B:168:0x031e, B:170:0x0323, B:173:0x0330, B:183:0x034c, B:187:0x035a, B:171:0x0327, B:155:0x02dc, B:142:0x025f), top: B:331:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0327 A[Catch: all -> 0x0449, TryCatch #4 {all -> 0x0449, blocks: (B:188:0x0387, B:190:0x038d, B:193:0x0397, B:195:0x03af, B:197:0x03b7, B:138:0x024d, B:140:0x0257, B:144:0x0285, B:146:0x028f, B:147:0x0295, B:149:0x02aa, B:152:0x02bb, B:154:0x02c3, B:156:0x02e0, B:158:0x02ec, B:160:0x02f7, B:162:0x02ff, B:165:0x030c, B:166:0x0314, B:168:0x031e, B:170:0x0323, B:173:0x0330, B:183:0x034c, B:187:0x035a, B:171:0x0327, B:155:0x02dc, B:142:0x025f), top: B:331:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0417 A[Catch: all -> 0x0454, TryCatch #2 {all -> 0x0454, blocks: (B:203:0x03ca, B:209:0x03f0, B:211:0x040f, B:213:0x0417, B:218:0x042c, B:220:0x0442, B:221:0x0447, B:214:0x041d, B:216:0x0423, B:217:0x0429, B:228:0x0452, B:210:0x0404), top: B:328:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041d A[Catch: all -> 0x0454, TryCatch #2 {all -> 0x0454, blocks: (B:203:0x03ca, B:209:0x03f0, B:211:0x040f, B:213:0x0417, B:218:0x042c, B:220:0x0442, B:221:0x0447, B:214:0x041d, B:216:0x0423, B:217:0x0429, B:228:0x0452, B:210:0x0404), top: B:328:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0442 A[Catch: all -> 0x0454, TryCatch #2 {all -> 0x0454, blocks: (B:203:0x03ca, B:209:0x03f0, B:211:0x040f, B:213:0x0417, B:218:0x042c, B:220:0x0442, B:221:0x0447, B:214:0x041d, B:216:0x0423, B:217:0x0429, B:228:0x0452, B:210:0x0404), top: B:328:0x018c }] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r28) {
        /*
            Method dump skipped, instructions count: 1729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahri.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
