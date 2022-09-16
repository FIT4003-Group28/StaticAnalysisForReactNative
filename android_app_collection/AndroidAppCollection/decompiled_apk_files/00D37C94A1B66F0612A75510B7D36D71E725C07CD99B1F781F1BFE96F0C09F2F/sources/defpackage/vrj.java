package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vrj  reason: default package */
/* loaded from: classes4.dex */
public final class vrj extends cvn {
    public static final vrj b = new vrj();
    private static final Set c;
    private static final Set d;
    private static final Set e;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("samr");
        hashSet.add("sawb");
        hashSet.add("mp4a");
        hashSet.add("drms");
        hashSet.add("alac");
        hashSet.add("owma");
        hashSet.add("ac-3");
        hashSet.add("ec-3");
        hashSet.add("mlpa");
        hashSet.add("dtsl");
        hashSet.add("dtsh");
        hashSet.add("dtse");
        hashSet.add("lpcm");
        hashSet.add("dtsc");
        hashSet.add("enca");
        HashSet hashSet2 = new HashSet();
        d = hashSet2;
        hashSet2.add("mp4v");
        hashSet2.add("s263");
        hashSet2.add("avc1");
        hashSet2.add("avc3");
        hashSet2.add("drmi");
        hashSet2.add("hvc1");
        hashSet2.add("hev1");
        hashSet2.add("encv");
        HashSet hashSet3 = new HashSet();
        e = hashSet3;
        hashSet3.add("tx3g");
        hashSet3.add("enct");
    }

    @Override // defpackage.cvn
    public final cvs b(String str, byte[] bArr) {
        if ("moov".equals(str)) {
            return new cwk();
        }
        if ("mvhd".equals(str)) {
            return new cwl();
        }
        if ("ftyp".equals(str)) {
            return new cwc();
        }
        if ("mdat".equals(str)) {
            return new cxr();
        }
        if ("moov".equals(str)) {
            return new cwk();
        }
        if ("mvhd".equals(str)) {
            return new cwl();
        }
        if ("trak".equals(str)) {
            return new cxd();
        }
        if ("tkhd".equals(str)) {
            return new cxe();
        }
        if ("edts".equals(str)) {
            return new axiw((byte[]) null);
        }
        if ("elst".equals(str)) {
            return new cwb();
        }
        if ("mdia".equals(str)) {
            return new cwh();
        }
        if ("mdhd".equals(str)) {
            return new cwi();
        }
        if ("vmhd".equals(str)) {
            return new cxh();
        }
        if ("smhd".equals(str)) {
            return new cwu();
        }
        if ("sthd".equals(str)) {
            return new cwz();
        }
        if ("hmhd".equals(str)) {
            return new cwg();
        }
        if ("hdlr".equals(str)) {
            return new cwf();
        }
        if ("minf".equals(str)) {
            return new cwj();
        }
        if ("dinf".equals(str)) {
            return new axiw();
        }
        if ("dref".equals(str)) {
            return new cvz();
        }
        if ("url ".equals(str)) {
            return new cvy();
        }
        if ("stbl".equals(str)) {
            return new cwr();
        }
        if ("ctts".equals(str)) {
            return new cvw();
        }
        if ("stsd".equals(str)) {
            return new cwp();
        }
        if ("stts".equals(str)) {
            return new cxc();
        }
        if ("stss".equals(str)) {
            return new cxa();
        }
        if ("stsc".equals(str)) {
            return new cwt();
        }
        if ("stsz".equals(str)) {
            return new cwq();
        }
        if ("stco".equals(str)) {
            return new cwv();
        }
        if ("co64".equals(str)) {
            return new cvt();
        }
        if ("skip".equals(str)) {
            return new cwe();
        }
        if ("free".equals(str)) {
            return new cwd();
        }
        if ("sdtp".equals(str)) {
            return new cwo();
        }
        if (c.contains(str)) {
            return new cxv(str);
        }
        if (d.contains(str)) {
            return new cyc(str);
        }
        if (e.contains(str)) {
            return new cya(str);
        }
        if ("stsd-stpp".equals(str)) {
            return new axls();
        }
        if ("stsd-mp4s".equals(str)) {
            return new cxw(str);
        }
        if ("udta".equals(str)) {
            return new axiw("udta");
        }
        if ("pasp".equals(str)) {
            return new axjy();
        }
        if ("uuid".equals(str)) {
            return new cxg(bArr);
        }
        if ("st3d".equals(str)) {
            return new vse();
        }
        if ("sv3d".equals(str)) {
            return new cxf();
        }
        if ("©xyz".equals(str)) {
            return new vsk();
        }
        return new cxf(str);
    }
}
