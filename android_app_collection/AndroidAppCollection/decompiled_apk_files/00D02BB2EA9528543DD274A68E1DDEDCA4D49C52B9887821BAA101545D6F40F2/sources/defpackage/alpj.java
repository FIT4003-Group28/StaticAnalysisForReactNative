package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.apps.gmm.map.impl.fbx.FbxModelLoaderSwigJNI;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alpj  reason: default package */
/* loaded from: classes.dex */
public final class alpj implements akvl {
    public final akpq a;
    public final bnsn b;
    private final akzh c;
    private final Executor d;
    private final ckcw e;

    public alpj(akpq akpqVar, bnsn bnsnVar, akzh akzhVar, Executor executor, ckcw ckcwVar) {
        this.a = akpqVar;
        this.b = bnsnVar;
        this.c = akzhVar;
        this.d = executor;
        this.e = ckcwVar;
    }

    @Override // defpackage.akvl
    public final aksm a(final InputStream inputStream) {
        akzh akzhVar;
        try {
            if (this.b == null || (akzhVar = this.c) == null) {
                return aksm.t;
            }
            final akpq akpqVar = this.a;
            Executor executor = this.d;
            final alma almaVar = new alma(akpqVar, akzhVar);
            executor.execute(new Runnable(inputStream, akpqVar, almaVar) { // from class: allz
                private final InputStream a;
                private final akpq b;
                private final alma c;

                {
                    this.a = inputStream;
                    this.b = akpqVar;
                    this.c = almaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final alsh alshVar;
                    pnp[] values;
                    String str;
                    InputStream inputStream2 = this.a;
                    akpq akpqVar2 = this.b;
                    alma almaVar2 = this.c;
                    dbsi a = dbsi.a(null, alma.b);
                    try {
                        byte[] bArr = new byte[inputStream2.available()];
                        inputStream2.read(bArr);
                        byte[] LoadFbxModel = FbxModelLoaderSwigJNI.LoadFbxModel(bArr);
                        if (LoadFbxModel == null) {
                            alshVar = null;
                        } else {
                            try {
                                alshVar = (alsh) dsqw.cr(alsh.h, LoadFbxModel, dsqa.c());
                            } catch (dsrm e) {
                                throw new RuntimeException("Unable to parse com.google.android.apps.gmm.map.impl.fbx.FbxModelLoaderProto.FbxModelResponse protocol message.", e);
                            }
                        }
                        int size = alshVar.f.size();
                        bnvv[] bnvvVarArr = new bnvv[size];
                        int i = 0;
                        for (final alse alseVar : alshVar.f) {
                            final bnvv bnvvVar = new bnvv();
                            bnvvVar.a = alseVar.b;
                            akpqVar2.e(new Runnable(bnvvVar, alseVar) { // from class: almb
                                private final bnvv a;
                                private final alse b;

                                {
                                    this.a = bnvvVar;
                                    this.b = alseVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    bnvv bnvvVar2 = this.a;
                                    int[] iArr = new int[1];
                                    InputStream r = this.b.a.r();
                                    int i2 = 0;
                                    if (r != null) {
                                        Bitmap decodeStream = BitmapFactory.decodeStream(r);
                                        GLES20.glGenTextures(1, iArr, 0);
                                        GLES20.glActiveTexture(33984);
                                        GLES20.glBindTexture(3553, iArr[0]);
                                        GLUtils.texImage2D(3553, 0, decodeStream, 0);
                                        GLES20.glTexParameteri(3553, 10241, 9729);
                                        GLES20.glTexParameteri(3553, 10240, 9729);
                                        GLES20.glTexParameteri(3553, 10242, 10497);
                                        GLES20.glTexParameteri(3553, 10243, 10497);
                                        i2 = iArr[0];
                                    }
                                    bnvvVar2.d = i2;
                                }
                            });
                            bnvvVarArr[i] = bnvvVar;
                            i++;
                        }
                        final ArrayList arrayList = new ArrayList();
                        for (alsc alscVar : alshVar.a) {
                            arrayList.add(new bnvt("", alscVar.d, 0, alscVar.a, alscVar.b, alscVar.c));
                            bnvt bnvtVar = (bnvt) dcft.s(arrayList);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                bnvv bnvvVar2 = bnvvVarArr[i2];
                                if (bnvvVar2.a.equals(bnvtVar.b)) {
                                    bnvtVar.h = bnvvVar2;
                                    break;
                                }
                                i2++;
                            }
                            if (bnvtVar.h == null) {
                                bnvtVar.h = new bnvv();
                            }
                            bnvtVar.g = bnvtVar.e * alshVar.b;
                        }
                        akpqVar2.e(new Runnable(alshVar, arrayList) { // from class: almc
                            private final alsh a;
                            private final ArrayList b;

                            {
                                this.a = alshVar;
                                this.b = arrayList;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                alsh alshVar2 = this.a;
                                ArrayList arrayList2 = this.b;
                                dspd dspdVar = alshVar2.g;
                                int[] iArr = new int[1];
                                byte[] G = dspdVar.G();
                                GLES20.glGenBuffers(1, iArr, 0);
                                ByteBuffer order = ByteBuffer.allocateDirect(dspdVar.c()).order(ByteOrder.nativeOrder());
                                order.put(G);
                                order.rewind();
                                GLES20.glBindBuffer(34962, iArr[0]);
                                GLES20.glBufferData(34962, dspdVar.c(), order, 35044);
                                int i3 = iArr[0];
                                int size2 = arrayList2.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    ((bnvt) arrayList2.get(i4)).f = i3;
                                }
                            }
                        });
                        alsg alsgVar = alshVar.d;
                        if (alsgVar == null) {
                            alsgVar = alsg.d;
                        }
                        float f = alsgVar.a;
                        alsg alsgVar2 = alshVar.d;
                        if (alsgVar2 == null) {
                            alsgVar2 = alsg.d;
                        }
                        float f2 = alsgVar2.b;
                        alsg alsgVar3 = alshVar.d;
                        if (alsgVar3 == null) {
                            alsgVar3 = alsg.d;
                        }
                        bnvs bnvsVar = new bnvs(f, f2, alsgVar3.c);
                        alsg alsgVar4 = alshVar.e;
                        if (alsgVar4 == null) {
                            alsgVar4 = alsg.d;
                        }
                        float f3 = alsgVar4.a;
                        alsg alsgVar5 = alshVar.e;
                        if (alsgVar5 == null) {
                            alsgVar5 = alsg.d;
                        }
                        float f4 = alsgVar5.b;
                        alsg alsgVar6 = alshVar.e;
                        if (alsgVar6 == null) {
                            alsgVar6 = alsg.d;
                        }
                        bnvs bnvsVar2 = new bnvs(f3, f4, alsgVar6.c);
                        HashMap hashMap = new HashMap();
                        for (int i3 = 0; i3 < alshVar.c.size(); i3++) {
                            hashMap.put(alshVar.c.get(i3), Integer.valueOf(hashMap.size()));
                        }
                        HashMap hashMap2 = new HashMap();
                        for (String str2 : hashMap.keySet()) {
                            for (pnp pnpVar : pnp.values()) {
                                if (!str2.equals(pnpVar.g) && !str2.contains(pnpVar.g)) {
                                }
                                str = pnpVar.g;
                                break;
                            }
                            str = null;
                            if (str == null) {
                                if (str2.contains("left")) {
                                    str = pnp.TURN_LEFT.g;
                                } else if (str2.contains("right")) {
                                    str = pnp.TURN_RIGHT.g;
                                }
                            }
                            if (str == null) {
                                str = str2;
                            }
                            if (((Integer) hashMap2.put(str, (Integer) hashMap.get(str2))) != null) {
                                hashMap.keySet();
                            }
                        }
                        bnvsVar2.l(bnvsVar);
                        a = dbsi.a(new bnvu(arrayList, bnvsVar, bnvsVar2), new alpl(alshVar.b, hashMap2));
                    } catch (IOException unused) {
                    }
                    almaVar2.l((bnvu) a.a, (alpl) a.b);
                    try {
                        inputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
            });
            this.a.e(new Runnable(this, almaVar) { // from class: alpf
                private final alpj a;
                private final alma b;

                {
                    this.a = this;
                    this.b = almaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    alpj alpjVar = this.a;
                    alma almaVar2 = this.b;
                    bnug bnugVar = alpjVar.b.n;
                    if (bnugVar != null) {
                        bnugVar.a(almaVar2);
                    }
                }
            });
            this.a.d();
            ((ckcn) this.e.a(ckhi.bc)).a();
            return almaVar;
        } catch (RuntimeException unused) {
            return aksm.t;
        }
    }

    @Override // defpackage.akvl
    public final void b(final akvk akvkVar) {
        akvkVar.c(new Runnable(this, akvkVar) { // from class: alpg
            private final alpj a;
            private final akvk b;

            {
                this.a = this;
                this.b = akvkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final alpj alpjVar = this.a;
                akvk akvkVar2 = this.b;
                if (akvkVar2 instanceof bnus) {
                    final bnus bnusVar = (bnus) akvkVar2;
                    alpjVar.a.e(new Runnable(alpjVar, bnusVar) { // from class: alph
                        private final alpj a;
                        private final bnus b;

                        {
                            this.a = alpjVar;
                            this.b = bnusVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            alpj alpjVar2 = this.a;
                            bnus bnusVar2 = this.b;
                            bnsn bnsnVar = alpjVar2.b;
                            if (bnsnVar != null) {
                                bnug bnugVar = bnsnVar.n;
                                if (bnugVar != null) {
                                    dbsk.l(bnugVar.b.B());
                                    bnugVar.d.remove(bnusVar2);
                                }
                                bnusVar2.u().b();
                            }
                        }
                    });
                } else if (!(akvkVar2 instanceof bnut)) {
                } else {
                    final bnut bnutVar = (bnut) akvkVar2;
                    alpjVar.a.e(new Runnable(alpjVar, bnutVar) { // from class: alpi
                        private final alpj a;
                        private final bnut b;

                        {
                            this.a = alpjVar;
                            this.b = bnutVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            alpj alpjVar2 = this.a;
                            bnut bnutVar2 = this.b;
                            bnsn bnsnVar = alpjVar2.b;
                            if (bnsnVar != null) {
                                bnug bnugVar = bnsnVar.n;
                                if (bnugVar != null) {
                                    dbsk.l(bnugVar.b.B());
                                    bnugVar.c.remove(bnutVar2);
                                }
                                bnutVar2.u().b();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // defpackage.akvl
    public final aksm c(final List<? extends InputStream> list, final InputStream inputStream, final Map<String, InputStream> map) {
        akzh akzhVar;
        try {
            if (this.b == null || (akzhVar = this.c) == null) {
                return aksm.t;
            }
            final akpq akpqVar = this.a;
            Executor executor = this.d;
            final almy almyVar = new almy(akpqVar, akzhVar);
            executor.execute(new Runnable(inputStream, map, akpqVar, list, almyVar) { // from class: almw
                private final InputStream a;
                private final Map b;
                private final akpq c;
                private final List d;
                private final almy e;

                {
                    this.a = inputStream;
                    this.b = map;
                    this.c = akpqVar;
                    this.d = list;
                    this.e = almyVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:179:0x0595 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:182:0x05a0  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1514
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.almw.run():void");
                }
            });
            this.a.e(new Runnable(this, almyVar) { // from class: alpe
                private final alpj a;
                private final almy b;

                {
                    this.a = this;
                    this.b = almyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    alpj alpjVar = this.a;
                    almy almyVar2 = this.b;
                    bnug bnugVar = alpjVar.b.n;
                    if (bnugVar != null) {
                        bnugVar.a(almyVar2);
                    }
                }
            });
            this.a.d();
            ((ckcn) this.e.a(ckhi.bd)).a();
            return almyVar;
        } catch (Exception unused) {
            return aksm.t;
        }
    }
}
