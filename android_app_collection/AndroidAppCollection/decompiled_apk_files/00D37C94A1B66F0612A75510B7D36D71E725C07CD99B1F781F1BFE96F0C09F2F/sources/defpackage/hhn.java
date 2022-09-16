package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.channels.Channels;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hhn  reason: default package */
/* loaded from: classes3.dex */
public final class hhn extends hhp {
    public final String c;
    public Bitmap f;
    public File g;
    public WeakReference h;
    private final Context m;
    private axcw n;
    private ShortsVideoMetadata o;
    private String p;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final List d = new ArrayList();
    public final Deque e = new ArrayDeque();
    public String i = "";
    public int j = -1;

    public hhn(String str, Context context, String str2) {
        this.c = str;
        this.m = context;
        this.l = str2;
    }

    private final String F() {
        if (this.i.isEmpty()) {
            synchronized (this.b) {
                this.i = bakj.a("'composed_video'_yyyyMMdd_HHmmssSSS'.mp4'").a(baia.c());
                t();
            }
        }
        return this.i;
    }

    public static hhn a(Context context, String str) {
        return new hhn("DraftProject", context, str);
    }

    public static hhn b(String str, Bundle bundle, Context context, String str2) {
        ArrayList<ProtoParsers$InternalDontUse> arrayList;
        axcw axcwVar;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Open project: ".concat(valueOf);
        }
        if (str != null && str2 != null) {
            hhn hhnVar = new hhn(str, context, str2);
            if (hhnVar.k().exists()) {
                synchronized (hhnVar.b) {
                    File i = hhnVar.i("project_state");
                    if (!i.exists()) {
                        String valueOf2 = String.valueOf(i);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                        sb.append("Project State not found: ");
                        sb.append(valueOf2);
                        zep.c("ShortsProject", sb.toString());
                    } else {
                        try {
                            jh jhVar = new jh(i);
                            if (jhVar.c.exists()) {
                                jh.a(jhVar.c, jhVar.a);
                            }
                            if (jhVar.b.exists() && jhVar.a.exists() && !jhVar.b.delete()) {
                                Log.e("AtomicFile", "Failed to delete outdated new file " + jhVar.b);
                            }
                            FileInputStream fileInputStream = new FileInputStream(jhVar.a);
                            try {
                                byte[] bArr = new byte[fileInputStream.available()];
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    int length = bArr.length;
                                    int read = fileInputStream.read(bArr, i3, length - i3);
                                    if (read <= 0) {
                                        break;
                                    }
                                    i3 += read;
                                    int available = fileInputStream.available();
                                    if (available > length - i3) {
                                        byte[] bArr2 = new byte[available + i3];
                                        System.arraycopy(bArr, 0, bArr2, 0, i3);
                                        bArr = bArr2;
                                    }
                                }
                                fileInputStream.close();
                                axcx axcxVar = (axcx) aopi.parseFrom(axcx.b, bArr, aoos.b());
                                hhnVar.d.clear();
                                if ((axcxVar.c & 1) != 0) {
                                    axcy axcyVar = axcxVar.d;
                                    if (axcyVar == null) {
                                        axcyVar = axcy.a;
                                    }
                                    hhnVar.d.addAll(axcyVar.b);
                                    if (!axcyVar.c.isEmpty()) {
                                        axcy axcyVar2 = axcxVar.d;
                                        if (axcyVar2 == null) {
                                            axcyVar2 = axcy.a;
                                        }
                                        hhnVar.n = (axcw) axcyVar2.c.get(0);
                                    }
                                }
                                int i4 = axcxVar.c;
                                if ((i4 & 2) != 0) {
                                    hhnVar.i = axcxVar.e;
                                }
                                if ((i4 & 4) != 0) {
                                    hhnVar.l = axcxVar.g;
                                }
                                if ((i4 & 8) != 0) {
                                    hhnVar.j = axcxVar.h;
                                }
                                if ((i4 & 16) != 0) {
                                    hhnVar.p = axcxVar.i;
                                }
                                Iterator it = hhnVar.d.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        for (auuv auuvVar : new aops(axcxVar.f, axcx.a)) {
                                            super.r(auuvVar);
                                        }
                                        if (bundle != null) {
                                            String str3 = hhnVar.c;
                                            if (str3.length() != 0) {
                                                "RestoreInstanceState for project: ".concat(str3);
                                            }
                                            synchronized (hhnVar.b) {
                                                hhnVar.o = (ShortsVideoMetadata) bundle.getParcelable("SHORTS_PROJECT_COMPOSED_VIDEO_KEY");
                                                try {
                                                    axda axdaVar = axda.a;
                                                    aoos b = aoos.b();
                                                    Parcelable parcelable = bundle.getParcelable("SHORTS_PROJECT_REDO_STACK_KEY");
                                                    if (parcelable instanceof Bundle) {
                                                        Bundle bundle2 = (Bundle) parcelable;
                                                        bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                                                        arrayList = bundle2.getParcelableArrayList("protoparsers");
                                                    } else {
                                                        arrayList = (ArrayList) parcelable;
                                                    }
                                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                                    for (ProtoParsers$InternalDontUse protoParsers$InternalDontUse : arrayList) {
                                                        arrayList2.add(aphq.h(protoParsers$InternalDontUse, axdaVar, b));
                                                    }
                                                    hhnVar.e.clear();
                                                    hhnVar.e.addAll(arrayList2);
                                                    if (bundle.containsKey("SHORTS_PROJECT_AUDIO_TRACK_KEY") && (axcwVar = (axcw) aphq.i(bundle, "SHORTS_PROJECT_AUDIO_TRACK_KEY", axcw.a, aoos.b())) != null) {
                                                        hhnVar.n = axcwVar;
                                                    }
                                                } catch (aopx unused) {
                                                    hhnVar.e.clear();
                                                }
                                            }
                                        }
                                        if (i2 > 0 || !hhnVar.e.isEmpty()) {
                                            hhnVar.v();
                                        } else if (bundle == null || hhnVar.n == null) {
                                            String valueOf3 = String.valueOf(i);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 30);
                                            sb2.append("Project State has 0 duration: ");
                                            sb2.append(valueOf3);
                                            zep.c("ShortsProject", sb2.toString());
                                        }
                                        return hhnVar;
                                    }
                                    axda axdaVar2 = (axda) it.next();
                                    if ((axdaVar2.b & 1) == 0) {
                                        break;
                                    }
                                    File i5 = hhnVar.i(axdaVar2.e);
                                    if (!i5.exists()) {
                                        String valueOf4 = String.valueOf(i5);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 30);
                                        sb3.append("Video segment does not exist! ");
                                        sb3.append(valueOf4);
                                        zep.c("ShortsProject", sb3.toString());
                                        break;
                                    }
                                    axcz axczVar = axdaVar2.f;
                                    if (axczVar == null) {
                                        axczVar = axcz.a;
                                    }
                                    i2 += axczVar.d;
                                }
                            } catch (Throwable th) {
                                fileInputStream.close();
                                throw th;
                            }
                        } catch (IOException e) {
                            String valueOf5 = String.valueOf(i);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 33);
                            sb4.append("Project State could not be read: ");
                            sb4.append(valueOf5);
                            zep.f("ShortsProject", sb4.toString(), e);
                        }
                    }
                    return null;
                }
            }
            zep.c("ShortsProject", "Project directory not found");
        }
        return null;
    }

    public final void A(boolean z) {
        String str;
        if (y()) {
            return;
        }
        if (!this.d.isEmpty() && (((axda) arey.s(this.d)).b & 16) != 0) {
            File i = i(((axda) arey.s(this.d)).h);
            try {
                try {
                    str = i.getCanonicalPath();
                    try {
                        String canonicalPath = i.getCanonicalPath();
                        if (!i.exists()) {
                            String valueOf = String.valueOf(canonicalPath);
                            throw new FileNotFoundException(valueOf.length() != 0 ? "File not found at ".concat(valueOf) : new String("File not found at "));
                        }
                        Bitmap decodeFile = BitmapFactory.decodeFile(canonicalPath);
                        if (decodeFile != null) {
                            this.f = decodeFile;
                            this.a.remove(str);
                            return;
                        }
                        String valueOf2 = String.valueOf(canonicalPath);
                        throw new IOException(valueOf2.length() != 0 ? "Could not decode bitmap file at ".concat(valueOf2) : new String("Could not decode bitmap file at "));
                    } catch (IOException e) {
                        e = e;
                        this.f = null;
                        if (!z || str == null || !this.a.add(str)) {
                            return;
                        }
                        zep.f("ShortsProject", "IOException when loading align overlay image", e);
                        afus.c(2, 6, "[ShortsCreation][Android][ProjectState]IOException when decoding align overlay image", e);
                    }
                } catch (OutOfMemoryError e2) {
                    this.f = null;
                    zep.f("ShortsProject", "Out of memory when loading align overlay image", e2);
                    afus.c(2, 6, "[ShortsCreation][Android][ProjectState]Out of memory when decoding align overlay image", e2);
                }
            } catch (IOException e3) {
                e = e3;
                str = null;
            }
        } else {
            this.f = null;
        }
    }

    @Override // defpackage.hhp
    public final ampq c() {
        return ampq.i(this.n);
    }

    @Override // defpackage.hhp
    public final ampq d() {
        ShortsVideoMetadata shortsVideoMetadata;
        Context context;
        synchronized (this.b) {
            File g = g(F());
            if (g.exists()) {
                ShortsVideoMetadata shortsVideoMetadata2 = this.o;
                if (shortsVideoMetadata2 != null) {
                    shortsVideoMetadata = shortsVideoMetadata2;
                } else {
                    if (!g.delete()) {
                        String valueOf = String.valueOf(g);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        sb.append("Failed to delete composed video ");
                        sb.append(valueOf);
                        String sb2 = sb.toString();
                        zep.b(sb2);
                        String valueOf2 = String.valueOf(sb2);
                        afus.b(2, 6, valueOf2.length() != 0 ? "[ShortsCreation][Android][ProjectState]".concat(valueOf2) : new String("[ShortsCreation][Android][ProjectState]"));
                    }
                    this.i = "";
                    g = g(F());
                }
            }
            File file = g;
            if (this.d.isEmpty()) {
                afus.b(2, 6, "[ShortsCreation][Android][ProjectState]No segments found");
                shortsVideoMetadata = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (axda axdaVar : this.d) {
                    arrayList.add(i(axdaVar.e));
                }
                try {
                    context = this.m;
                } catch (vsb e) {
                    e = e;
                    shortsVideoMetadata = null;
                }
                try {
                    if (arrayList.size() <= 0) {
                        throw new vsb("Fewer than one segment to merge");
                    }
                    try {
                        axje axjeVar = new axje();
                        axjh[] axjhVarArr = new axjh[arrayList.size()];
                        axjh[] axjhVarArr2 = new axjh[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            axja g2 = vqz.g(context, Uri.fromFile((File) arrayList.get(i)));
                            try {
                                cwk a = new cvq(g2, vrj.b).a();
                                if (a != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    try {
                                        for (cxd cxdVar : a.j(cxd.class)) {
                                            int size = arrayList2.size();
                                            StringBuilder sb3 = new StringBuilder(17);
                                            sb3.append("track-");
                                            sb3.append(size);
                                            arrayList2.add(new axjf(sb3.toString(), cxdVar, new cvq[0]));
                                        }
                                        axjh c = vsc.c(arrayList2);
                                        axjh b = vsc.b(arrayList2, "soun");
                                        axjhVarArr[i] = c;
                                        axjhVarArr2[i] = b;
                                    } catch (Exception e2) {
                                        Log.e("Mp4VideoMerger", "createMp4Track failed", e2);
                                        throw new vsb(e2);
                                    }
                                } else {
                                    throw new vsb("Failed to get video movie box");
                                }
                            } catch (IOException e3) {
                                g2.close();
                                throw e3;
                            }
                        }
                        axjeVar.b(new axju(axjhVarArr));
                        axjeVar.b(new axju(axjhVarArr2));
                        try {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    ((axiz) new axjk().c(axjeVar)).k(Channels.newChannel(fileOutputStream));
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e4) {
                                        Log.w("Mp4VideoMerger", "Failed to close output stream. Ignoring and attempting to move on.", e4);
                                    }
                                    vsh vshVar = new vsh();
                                    axjh c2 = vsc.c(axjeVar.d);
                                    vshVar.a = Uri.fromFile(file);
                                    vshVar.b = false;
                                    vshVar.d = (int) Math.round(c2.j().f);
                                    vshVar.e = (int) Math.round(c2.j().g);
                                    vshVar.f = vsr.b(c2.j().e);
                                    double micros = TimeUnit.SECONDS.toMicros(c2.a());
                                    double d = c2.j().b;
                                    Double.isNaN(micros);
                                    Double.isNaN(d);
                                    vshVar.h = Math.round(micros / d);
                                    vshVar.i = new long[]{0};
                                    try {
                                        VideoMetaData a2 = vshVar.a();
                                        int i2 = a2.d;
                                        int i3 = a2.e;
                                        int i4 = a2.f % 180;
                                        int i5 = i4 == 90 ? i2 : i3;
                                        if (i4 == 90) {
                                            i2 = i3;
                                        }
                                        double d2 = a2.g;
                                        Double.isNaN(d2);
                                        long round = Math.round(d2 / 1000.0d);
                                        gyr e5 = ShortsVideoMetadata.e();
                                        e5.c(Uri.fromFile(file));
                                        e5.e(i2);
                                        e5.b(i5);
                                        e5.d(round);
                                        shortsVideoMetadata = e5.a();
                                        this.o = shortsVideoMetadata;
                                    } catch (IOException e6) {
                                        throw new vsb(e6, null);
                                    }
                                } catch (Exception e7) {
                                    Log.e("Mp4VideoMerger", "DefaultMp4Builder failed", e7);
                                    throw new vsb(e7);
                                }
                            } catch (FileNotFoundException e8) {
                                e = e8;
                                throw new vsb(e);
                            }
                        } catch (FileNotFoundException e9) {
                            e = e9;
                            throw new vsb(e);
                        }
                    } catch (IOException e10) {
                        throw new vsb(e10);
                    }
                } catch (vsb e11) {
                    e = e11;
                    zep.d("Failed to merge segments", e);
                    afus.c(2, 6, "[ShortsCreation][Android][ProjectState]Failed to merge segments", e);
                    return ampq.i(shortsVideoMetadata);
                }
            }
        }
        return ampq.i(shortsVideoMetadata);
    }

    @Override // defpackage.hhp
    public final ampq e() {
        return ampq.i(this.p);
    }

    public final amuk f() {
        return amuk.o(this.d);
    }

    public final File g(String str) {
        File file = new File(C(this.m), "composed_videos");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public final File h() {
        if (this.d.isEmpty() || (((axda) arey.s(this.d)).b & 1) == 0) {
            return null;
        }
        return i(((axda) arey.s(this.d)).e);
    }

    public final File i(String str) {
        return new File(k(), str);
    }

    public final File j() {
        File file = this.g;
        if (file == null) {
            return null;
        }
        return i(file.toString());
    }

    @Override // defpackage.hhp
    public final File k() {
        return new File(C(this.m), this.c);
    }

    @Override // defpackage.hhp
    public final String l() {
        return this.c;
    }

    @Override // defpackage.hhp
    public final void m() {
        z();
        v();
    }

    @Override // defpackage.hhp
    public final void n() {
        z();
    }

    @Override // defpackage.hhp
    public final void o(ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
        synchronized (this.b) {
            aopa createBuilder = axcw.a.createBuilder();
            String k = shortsCreationSelectedTrack.k();
            createBuilder.copyOnWrite();
            axcw axcwVar = (axcw) createBuilder.instance;
            axcwVar.b |= 1;
            axcwVar.c = k;
            avhn h = shortsCreationSelectedTrack.h();
            String j = shortsCreationSelectedTrack.j();
            if (h != null && j != null) {
                aopa createBuilder2 = axcv.a.createBuilder();
                createBuilder2.copyOnWrite();
                axcv axcvVar = (axcv) createBuilder2.instance;
                axcvVar.d = h;
                axcvVar.b |= 2;
                createBuilder2.copyOnWrite();
                axcv axcvVar2 = (axcv) createBuilder2.instance;
                axcvVar2.b |= 1;
                axcvVar2.c = j;
                createBuilder.copyOnWrite();
                axcw axcwVar2 = (axcw) createBuilder.instance;
                axcv axcvVar3 = (axcv) createBuilder2.mo39build();
                axcvVar3.getClass();
                axcwVar2.e = axcvVar3;
                axcwVar2.b |= 4;
            }
            aopa createBuilder3 = axcz.a.createBuilder();
            int a = (int) shortsCreationSelectedTrack.a();
            createBuilder3.copyOnWrite();
            axcz axczVar = (axcz) createBuilder3.instance;
            axczVar.b |= 1;
            axczVar.c = a;
            axcz axczVar2 = (axcz) createBuilder3.mo39build();
            String i = shortsCreationSelectedTrack.i();
            if (i != null) {
                createBuilder.copyOnWrite();
                axcw axcwVar3 = (axcw) createBuilder.instance;
                axcwVar3.b |= 8;
                axcwVar3.f = i;
            }
            apzg f = shortsCreationSelectedTrack.f();
            if (f != null) {
                createBuilder.copyOnWrite();
                axcw axcwVar4 = (axcw) createBuilder.instance;
                axcwVar4.g = f;
                axcwVar4.b |= 16;
            }
            createBuilder.copyOnWrite();
            axcw axcwVar5 = (axcw) createBuilder.instance;
            axczVar2.getClass();
            axcwVar5.d = axczVar2;
            axcwVar5.b |= 2;
            this.n = (axcw) createBuilder.mo39build();
            t();
        }
    }

    @Override // defpackage.hhp
    public final void p(String str) {
        synchronized (this.b) {
            this.p = str;
            t();
        }
    }

    @Override // defpackage.hhp
    public final void q(Bundle bundle) {
        super.q(bundle);
        bundle.putParcelable("SHORTS_PROJECT_COMPOSED_VIDEO_KEY", this.o);
        axcw axcwVar = this.n;
        if (axcwVar != null) {
            aphq.m(bundle, "SHORTS_PROJECT_AUDIO_TRACK_KEY", axcwVar);
        }
        ArrayList<aoqu> arrayList = new ArrayList(this.e);
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        for (aoqu aoquVar : arrayList) {
            arrayList2.add(aphq.k(aoquVar));
        }
        bundle2.putParcelableArrayList("protoparsers", arrayList2);
        bundle.putParcelable("SHORTS_PROJECT_REDO_STACK_KEY", bundle2);
    }

    @Override // defpackage.hhp
    public final void r(auuv auuvVar) {
        super.r(auuvVar);
        t();
    }

    @Override // defpackage.hhp
    public final void s() {
        synchronized (this.b) {
            if (this.n == null) {
                return;
            }
            this.n = null;
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad A[Catch: all -> 0x01e2, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0004, B:7:0x0011, B:8:0x0020, B:10:0x0037, B:11:0x003d, B:13:0x0046, B:15:0x0055, B:16:0x005b, B:17:0x0060, B:19:0x0080, B:20:0x0094, B:21:0x009a, B:23:0x00a0, B:25:0x00b8, B:26:0x00be, B:27:0x00c6, B:29:0x00ca, B:30:0x00d9, B:32:0x00dd, B:33:0x00ec, B:35:0x00f8, B:37:0x00fe, B:38:0x0101, B:39:0x0106, B:41:0x010e, B:42:0x0115, B:48:0x0132, B:50:0x0141, B:51:0x0148, B:54:0x014d, B:55:0x0154, B:82:0x01e0, B:44:0x011e, B:46:0x012a, B:59:0x0177, B:60:0x018f, B:57:0x015e, B:58:0x0176, B:69:0x019c, B:72:0x01a7, B:74:0x01ad, B:75:0x01b4, B:78:0x01b9, B:79:0x01c0, B:81:0x01c8), top: B:91:0x0004, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8 A[Catch: all -> 0x01e2, TryCatch #2 {, blocks: (B:5:0x0004, B:7:0x0011, B:8:0x0020, B:10:0x0037, B:11:0x003d, B:13:0x0046, B:15:0x0055, B:16:0x005b, B:17:0x0060, B:19:0x0080, B:20:0x0094, B:21:0x009a, B:23:0x00a0, B:25:0x00b8, B:26:0x00be, B:27:0x00c6, B:29:0x00ca, B:30:0x00d9, B:32:0x00dd, B:33:0x00ec, B:35:0x00f8, B:37:0x00fe, B:38:0x0101, B:39:0x0106, B:41:0x010e, B:42:0x0115, B:48:0x0132, B:50:0x0141, B:51:0x0148, B:54:0x014d, B:55:0x0154, B:82:0x01e0, B:44:0x011e, B:46:0x012a, B:59:0x0177, B:60:0x018f, B:57:0x015e, B:58:0x0176, B:69:0x019c, B:72:0x01a7, B:74:0x01ad, B:75:0x01b4, B:78:0x01b9, B:79:0x01c0, B:81:0x01c8), top: B:91:0x0004, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhn.t():void");
    }

    public final void u() {
        WeakReference weakReference = this.h;
        hhm hhmVar = weakReference != null ? (hhm) weakReference.get() : null;
        if (hhmVar != null) {
            synchronized (this.b) {
                int i = this.j;
                if (i != -1) {
                    hhmVar.b(i);
                }
            }
        }
    }

    public final void v() {
        hhm hhmVar = null;
        this.f = null;
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            hhmVar = (hhm) weakReference.get();
        }
        if (hhmVar != null) {
            synchronized (this.b) {
                int[] iArr = new int[this.d.size()];
                for (int i = 0; i < this.d.size(); i++) {
                    axcz axczVar = ((axda) this.d.get(i)).f;
                    if (axczVar == null) {
                        axczVar = axcz.a;
                    }
                    iArr[i] = axczVar.d;
                }
                hhmVar.a(iArr);
                hhmVar.d(x());
                hhmVar.c(w());
            }
        }
    }

    public final boolean w() {
        return !this.e.isEmpty();
    }

    public final boolean x() {
        return !this.d.isEmpty();
    }

    public final boolean y() {
        return this.f != null;
    }

    public final void z() {
        synchronized (this.b) {
            for (axda axdaVar : this.e) {
                File i = i(axdaVar.e);
                if (i.exists()) {
                    i.delete();
                }
                File i2 = i(axdaVar.h);
                if (i2.exists()) {
                    i2.delete();
                }
            }
            this.e.clear();
        }
    }
}
