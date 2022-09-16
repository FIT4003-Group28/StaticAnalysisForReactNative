package defpackage;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: axkm  reason: default package */
/* loaded from: classes2.dex */
public final class axkm {
    protected static Logger a = Logger.getLogger(axkm.class.getName());
    protected static Map b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet();
        hashSet.add(axkg.class);
        hashSet.add(axko.class);
        hashSet.add(axkc.class);
        hashSet.add(axkj.class);
        hashSet.add(axkl.class);
        hashSet.add(axkn.class);
        hashSet.add(axkb.class);
        hashSet.add(axkk.class);
        hashSet.add(axki.class);
        hashSet.add(axkf.class);
        for (Class cls : hashSet) {
            axkh axkhVar = (axkh) cls.getAnnotation(axkh.class);
            int[] b2 = axkhVar.b();
            int a2 = axkhVar.a();
            Map map = (Map) b.get(Integer.valueOf(a2));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : b2) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(a2), map);
        }
    }

    public static axkc a(int i, ByteBuffer byteBuffer) {
        axkc axkpVar;
        int H = hy.H(byteBuffer);
        Map map = (Map) b.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) b.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(H));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            Logger logger = a;
            Level level = Level.WARNING;
            String hexString = Integer.toHexString(i);
            String hexString2 = Integer.toHexString(H);
            String valueOf = String.valueOf(cls);
            int length = String.valueOf(hexString).length();
            StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(hexString2).length() + String.valueOf(valueOf).length());
            sb.append("No ObjectDescriptor found for objectTypeIndication ");
            sb.append(hexString);
            sb.append(" and tag ");
            sb.append(hexString2);
            sb.append(" found: ");
            sb.append(valueOf);
            logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb.toString());
            axkpVar = new axkp();
        } else {
            try {
                axkpVar = (axkc) cls.newInstance();
            } catch (Exception e) {
                Logger logger2 = a;
                Level level2 = Level.SEVERE;
                String valueOf2 = String.valueOf(cls);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 99);
                sb2.append("Couldn't instantiate BaseDescriptor class ");
                sb2.append(valueOf2);
                sb2.append(" for objectTypeIndication ");
                sb2.append(i);
                sb2.append(" and tag ");
                sb2.append(H);
                logger2.logp(level2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb2.toString(), (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        axkpVar.T = H;
        int H2 = hy.H(byteBuffer);
        axkpVar.U = H2 & 127;
        int i2 = 1;
        while ((H2 >>> 7) == 1) {
            H2 = hy.H(byteBuffer);
            i2++;
            axkpVar.U = (axkpVar.U << 7) | (H2 & 127);
        }
        axkpVar.V = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(axkpVar.U);
        axkpVar.a(slice);
        byteBuffer.position(byteBuffer.position() + axkpVar.U);
        return axkpVar;
    }
}
