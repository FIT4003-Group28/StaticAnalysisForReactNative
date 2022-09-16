package defpackage;
/* compiled from: PG */
/* renamed from: anmc  reason: default package */
/* loaded from: classes.dex */
final class anmc {
    static final anmb a;

    static {
        anmb anmbVar = new anmb();
        a = anmbVar;
        byte[] bArr = anmbVar.b;
        int[] iArr = anmbVar.c;
        int[] iArr2 = anmbVar.a;
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < 217; i3++) {
            char charAt = "# #s #, #e #.# the #.com/#Â # of # and # in # to #\"#\">#\n#]# for # a # that #. # with #'# from # by #. The # on # as # is #ing #\n\t#:#ed #(# at #ly #=\"# of the #. This #,# not #er #al #='#ful #ive #less #est #ize #ous #".charAt(i3);
            if (charAt == '#') {
                iArr[i] = i2;
                i++;
            } else {
                bArr[i2] = (byte) charAt;
                i2++;
            }
        }
        for (int i4 = 0; i4 < 363; i4++) {
            iArr2[i4] = "     !! ! ,  *!  &!  \" !  ) *   * -  ! # !  #!*!  +  ,$ !  -  %  .  / #   0  1 .  \"   2  3!*   4%  ! # /   5  6  7  8 0  1 &   $   9 +   :  ;  < '  !=  >  ?! 4  @ 4  2  &   A *# (   B  C& ) %  ) !*# *-% A +! *.  D! %'  & E *6  F  G% ! *A *%  H! D  I!+!  J!+   K +- *4! A  L!*4  M  N +6  O!*% +.! K *G  P +%(  ! G *D +D  Q +# *K!*G!+D!+# +G +A +4!+% +K!+4!*D!+K!*K".charAt(i4) - ' ';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(byte[] r21, int r22, java.nio.ByteBuffer r23, int r24, int r25, defpackage.anmb r26, int r27) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anmc.a(byte[], int, java.nio.ByteBuffer, int, int, anmb, int):int");
    }
}
