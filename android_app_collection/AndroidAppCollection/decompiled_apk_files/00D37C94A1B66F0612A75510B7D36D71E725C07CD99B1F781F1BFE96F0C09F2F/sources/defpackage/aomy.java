package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: aomy  reason: default package */
/* loaded from: classes.dex */
public final class aomy {
    public static final Map a;

    static {
        amuf f;
        amuf amufVar;
        amuf f2;
        amuf amufVar2;
        amuf f3;
        amuf amufVar3;
        amuf f4;
        amuf f5;
        amuf amufVar4;
        amuf amufVar5;
        amuf amufVar6;
        amuf f6;
        amuf amufVar7;
        amuf f7;
        amuf amufVar8;
        amuf amufVar9;
        amuf amufVar10;
        amuf amufVar11;
        amuf amufVar12;
        amuf amufVar13;
        amuf amufVar14;
        amuf amufVar15;
        amuf f8;
        amuf amufVar16;
        amuf f9;
        amuf f10;
        amuf f11;
        amuf f12;
        amuf amufVar17;
        amuf amufVar18;
        amuf f13;
        amuf f14;
        amuf f15;
        amuf f16;
        amuf f17;
        amuf f18;
        amuf f19;
        amuf f20;
        amuf f21;
        amuf f22;
        amuf f23;
        amuf f24;
        amuf f25;
        amuf amufVar19;
        amuf f26;
        amuf f27;
        amuf f28;
        amuf f29;
        amuf f30;
        amuf f31;
        amuf f32;
        amuf f33;
        amuf f34;
        amuf f35;
        amuf f36;
        amuf f37;
        amuf f38;
        amuf f39;
        amuf f40;
        amuf f41;
        amuf f42;
        amuf f43;
        amuf f44;
        amuf f45;
        amuf f46;
        amuf f47;
        amuf f48;
        amuf f49;
        amuf f50;
        amuf f51;
        amuf f52;
        amuf f53;
        amuf f54;
        amuf f55;
        amuf f56;
        amuf f57;
        amuf f58;
        amuf f59;
        amuf f60;
        amuf f61;
        amuf f62;
        amuf f63;
        amuf f64;
        amuf f65;
        amuf f66;
        amuf f67;
        amuf f68;
        amuf f69;
        amuf f70;
        amuf f71;
        amuf f72;
        amuf f73;
        amuf f74;
        amuf f75;
        amuf f76;
        TreeMap treeMap = new TreeMap();
        if (treeMap.containsKey("s")) {
            f = (amuf) treeMap.get("s");
        } else {
            f = amuk.f();
            treeMap.put("s", f);
        }
        f.h(aomx.a(aona.SIZE, aomz.INTEGER));
        if (treeMap.containsKey("w")) {
            amufVar = (amuf) treeMap.get("w");
        } else {
            amuf f77 = amuk.f();
            treeMap.put("w", f77);
            amufVar = f77;
        }
        amufVar.h(aomx.a(aona.WIDTH, aomz.INTEGER));
        if (treeMap.containsKey("c")) {
            f2 = (amuf) treeMap.get("c");
        } else {
            f2 = amuk.f();
            treeMap.put("c", f2);
        }
        f2.h(aomx.a(aona.CROP, aomz.BOOLEAN));
        if (treeMap.containsKey("d")) {
            amufVar2 = (amuf) treeMap.get("d");
        } else {
            amuf f78 = amuk.f();
            treeMap.put("d", f78);
            amufVar2 = f78;
        }
        amufVar2.h(aomx.a(aona.DOWNLOAD, aomz.BOOLEAN));
        if (treeMap.containsKey("h")) {
            f3 = (amuf) treeMap.get("h");
        } else {
            f3 = amuk.f();
            treeMap.put("h", f3);
        }
        f3.h(aomx.a(aona.HEIGHT, aomz.INTEGER));
        if (treeMap.containsKey("s")) {
            amufVar3 = (amuf) treeMap.get("s");
        } else {
            amuf f79 = amuk.f();
            treeMap.put("s", f79);
            amufVar3 = f79;
        }
        amufVar3.h(aomx.a(aona.STRETCH, aomz.BOOLEAN));
        if (treeMap.containsKey("h")) {
            f4 = (amuf) treeMap.get("h");
        } else {
            f4 = amuk.f();
            treeMap.put("h", f4);
        }
        f4.h(aomx.a(aona.HTML, aomz.BOOLEAN));
        if (treeMap.containsKey("p")) {
            f5 = (amuf) treeMap.get("p");
        } else {
            f5 = amuk.f();
            treeMap.put("p", f5);
        }
        f5.h(aomx.a(aona.SMART_CROP, aomz.BOOLEAN));
        if (treeMap.containsKey("pp")) {
            amufVar4 = (amuf) treeMap.get("pp");
        } else {
            amuf f80 = amuk.f();
            treeMap.put("pp", f80);
            amufVar4 = f80;
        }
        amufVar4.h(aomx.a(aona.SMART_CROP_NO_CLIP, aomz.BOOLEAN));
        if (treeMap.containsKey("pf")) {
            amufVar5 = (amuf) treeMap.get("pf");
        } else {
            amuf f81 = amuk.f();
            treeMap.put("pf", f81);
            amufVar5 = f81;
        }
        amufVar5.h(aomx.a(aona.SMART_CROP_USE_FACE, aomz.BOOLEAN));
        if (treeMap.containsKey("n")) {
            amufVar6 = (amuf) treeMap.get("n");
        } else {
            amuf f82 = amuk.f();
            treeMap.put("n", f82);
            amufVar6 = f82;
        }
        amufVar6.h(aomx.a(aona.CENTER_CROP, aomz.BOOLEAN));
        if (treeMap.containsKey("r")) {
            f6 = (amuf) treeMap.get("r");
        } else {
            f6 = amuk.f();
            treeMap.put("r", f6);
        }
        f6.h(aomx.a(aona.ROTATE, aomz.INTEGER));
        if (treeMap.containsKey("r")) {
            amufVar7 = (amuf) treeMap.get("r");
        } else {
            amuf f83 = amuk.f();
            treeMap.put("r", f83);
            amufVar7 = f83;
        }
        amufVar7.h(aomx.a(aona.SKIP_REFERER_CHECK, aomz.BOOLEAN));
        if (treeMap.containsKey("o")) {
            f7 = (amuf) treeMap.get("o");
        } else {
            f7 = amuk.f();
            treeMap.put("o", f7);
        }
        f7.h(aomx.a(aona.OVERLAY, aomz.BOOLEAN));
        if (treeMap.containsKey("o")) {
            amufVar8 = (amuf) treeMap.get("o");
        } else {
            amuf f84 = amuk.f();
            treeMap.put("o", f84);
            amufVar8 = f84;
        }
        amufVar8.h(aomx.a(aona.OBJECT_ID, aomz.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("j")) {
            amufVar9 = (amuf) treeMap.get("j");
        } else {
            amuf f85 = amuk.f();
            treeMap.put("j", f85);
            amufVar9 = f85;
        }
        amufVar9.h(aomx.a(aona.FRAME_ID, aomz.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("x")) {
            amufVar10 = (amuf) treeMap.get("x");
        } else {
            amuf f86 = amuk.f();
            treeMap.put("x", f86);
            amufVar10 = f86;
        }
        amufVar10.h(aomx.a(aona.TILE_X, aomz.INTEGER));
        if (treeMap.containsKey("y")) {
            amufVar11 = (amuf) treeMap.get("y");
        } else {
            amuf f87 = amuk.f();
            treeMap.put("y", f87);
            amufVar11 = f87;
        }
        amufVar11.h(aomx.a(aona.TILE_Y, aomz.INTEGER));
        if (treeMap.containsKey("z")) {
            amufVar12 = (amuf) treeMap.get("z");
        } else {
            amuf f88 = amuk.f();
            treeMap.put("z", f88);
            amufVar12 = f88;
        }
        amufVar12.h(aomx.a(aona.TILE_ZOOM, aomz.INTEGER));
        if (treeMap.containsKey("g")) {
            amufVar13 = (amuf) treeMap.get("g");
        } else {
            amuf f89 = amuk.f();
            treeMap.put("g", f89);
            amufVar13 = f89;
        }
        amufVar13.h(aomx.a(aona.TILE_GENERATION, aomz.BOOLEAN));
        if (treeMap.containsKey("e")) {
            amufVar14 = (amuf) treeMap.get("e");
        } else {
            amuf f90 = amuk.f();
            treeMap.put("e", f90);
            amufVar14 = f90;
        }
        amufVar14.h(aomx.a(aona.EXPIRATION_TIME, aomz.INTEGER));
        if (treeMap.containsKey("f")) {
            amufVar15 = (amuf) treeMap.get("f");
        } else {
            amuf f91 = amuk.f();
            treeMap.put("f", f91);
            amufVar15 = f91;
        }
        amufVar15.h(aomx.a(aona.IMAGE_FILTER, aomz.STRING));
        if (treeMap.containsKey("k")) {
            f8 = (amuf) treeMap.get("k");
        } else {
            f8 = amuk.f();
            treeMap.put("k", f8);
        }
        f8.h(aomx.a(aona.KILL_ANIMATION, aomz.BOOLEAN));
        if (treeMap.containsKey("u")) {
            amufVar16 = (amuf) treeMap.get("u");
        } else {
            amuf f92 = amuk.f();
            treeMap.put("u", f92);
            amufVar16 = f92;
        }
        amufVar16.h(aomx.a(aona.UNFILTERED, aomz.BOOLEAN));
        if (treeMap.containsKey("ut")) {
            f9 = (amuf) treeMap.get("ut");
        } else {
            f9 = amuk.f();
            treeMap.put("ut", f9);
        }
        f9.h(aomx.a(aona.UNFILTERED_WITH_TRANSFORMS, aomz.BOOLEAN));
        if (treeMap.containsKey("i")) {
            f10 = (amuf) treeMap.get("i");
        } else {
            f10 = amuk.f();
            treeMap.put("i", f10);
        }
        f10.h(aomx.a(aona.INCLUDE_METADATA, aomz.BOOLEAN));
        if (treeMap.containsKey("a")) {
            f11 = (amuf) treeMap.get("a");
        } else {
            f11 = amuk.f();
            treeMap.put("a", f11);
        }
        f11.h(aomx.a(aona.ES_PORTRAIT_APPROVED_ONLY, aomz.BOOLEAN));
        if (treeMap.containsKey("b")) {
            f12 = (amuf) treeMap.get("b");
        } else {
            f12 = amuk.f();
            treeMap.put("b", f12);
        }
        f12.h(aomx.a(aona.BYPASS_TAKEDOWN, aomz.BOOLEAN));
        if (treeMap.containsKey("b")) {
            amufVar17 = (amuf) treeMap.get("b");
        } else {
            amuf f93 = amuk.f();
            treeMap.put("b", f93);
            amufVar17 = f93;
        }
        amufVar17.h(aomx.a(aona.BORDER_SIZE, aomz.INTEGER));
        if (treeMap.containsKey("c")) {
            amufVar18 = (amuf) treeMap.get("c");
        } else {
            amuf f94 = amuk.f();
            treeMap.put("c", f94);
            amufVar18 = f94;
        }
        amufVar18.h(aomx.a(aona.BORDER_COLOR, aomz.PREFIX_HEX));
        if (treeMap.containsKey("q")) {
            f13 = (amuf) treeMap.get("q");
        } else {
            f13 = amuk.f();
            treeMap.put("q", f13);
        }
        f13.h(aomx.a(aona.QUERY_STRING, aomz.STRING));
        if (treeMap.containsKey("fh")) {
            f14 = (amuf) treeMap.get("fh");
        } else {
            f14 = amuk.f();
            treeMap.put("fh", f14);
        }
        f14.h(aomx.a(aona.HORIZONTAL_FLIP, aomz.BOOLEAN));
        if (treeMap.containsKey("fv")) {
            f15 = (amuf) treeMap.get("fv");
        } else {
            f15 = amuk.f();
            treeMap.put("fv", f15);
        }
        f15.h(aomx.a(aona.VERTICAL_FLIP, aomz.BOOLEAN));
        if (treeMap.containsKey("fg")) {
            f16 = (amuf) treeMap.get("fg");
        } else {
            f16 = amuk.f();
            treeMap.put("fg", f16);
        }
        f16.h(aomx.a(aona.FORCE_TILE_GENERATION, aomz.BOOLEAN));
        if (treeMap.containsKey("ci")) {
            f17 = (amuf) treeMap.get("ci");
        } else {
            f17 = amuk.f();
            treeMap.put("ci", f17);
        }
        f17.h(aomx.a(aona.IMAGE_CROP, aomz.BOOLEAN));
        if (treeMap.containsKey("rw")) {
            f18 = (amuf) treeMap.get("rw");
        } else {
            f18 = amuk.f();
            treeMap.put("rw", f18);
        }
        f18.h(aomx.a(aona.REQUEST_WEBP, aomz.BOOLEAN));
        if (treeMap.containsKey("rwu")) {
            f19 = (amuf) treeMap.get("rwu");
        } else {
            f19 = amuk.f();
            treeMap.put("rwu", f19);
        }
        f19.h(aomx.a(aona.REQUEST_WEBP_UNLESS_MAYBE_TRANSPARENT, aomz.BOOLEAN));
        if (treeMap.containsKey("rwa")) {
            f20 = (amuf) treeMap.get("rwa");
        } else {
            f20 = amuk.f();
            treeMap.put("rwa", f20);
        }
        f20.h(aomx.a(aona.REQUEST_ANIMATED_WEBP, aomz.BOOLEAN));
        if (treeMap.containsKey("nw")) {
            f21 = (amuf) treeMap.get("nw");
        } else {
            f21 = amuk.f();
            treeMap.put("nw", f21);
        }
        f21.h(aomx.a(aona.NO_WEBP, aomz.BOOLEAN));
        if (treeMap.containsKey("rh")) {
            f22 = (amuf) treeMap.get("rh");
        } else {
            f22 = amuk.f();
            treeMap.put("rh", f22);
        }
        f22.h(aomx.a(aona.REQUEST_H264, aomz.BOOLEAN));
        if (treeMap.containsKey("no")) {
            f23 = (amuf) treeMap.get("no");
        } else {
            f23 = amuk.f();
            treeMap.put("no", f23);
        }
        f23.h(aomx.a(aona.NO_OVERLAY, aomz.BOOLEAN));
        if (treeMap.containsKey("ns")) {
            f24 = (amuf) treeMap.get("ns");
        } else {
            f24 = amuk.f();
            treeMap.put("ns", f24);
        }
        f24.h(aomx.a(aona.NO_SILHOUETTE, aomz.BOOLEAN));
        if (treeMap.containsKey("k")) {
            f25 = (amuf) treeMap.get("k");
        } else {
            f25 = amuk.f();
            treeMap.put("k", f25);
        }
        f25.h(aomx.a(aona.FOCUS_BLUR, aomz.INTEGER));
        if (treeMap.containsKey("p")) {
            amufVar19 = (amuf) treeMap.get("p");
        } else {
            amuf f95 = amuk.f();
            treeMap.put("p", f95);
            amufVar19 = f95;
        }
        amufVar19.h(aomx.a(aona.FOCAL_PLANE, aomz.INTEGER));
        if (treeMap.containsKey("l")) {
            f26 = (amuf) treeMap.get("l");
        } else {
            f26 = amuk.f();
            treeMap.put("l", f26);
        }
        f26.h(aomx.a(aona.QUALITY_LEVEL, aomz.INTEGER));
        if (treeMap.containsKey("v")) {
            f27 = (amuf) treeMap.get("v");
        } else {
            f27 = amuk.f();
            treeMap.put("v", f27);
        }
        f27.h(aomx.a(aona.QUALITY_BUCKET, aomz.INTEGER));
        if (treeMap.containsKey("nu")) {
            f28 = (amuf) treeMap.get("nu");
        } else {
            f28 = amuk.f();
            treeMap.put("nu", f28);
        }
        f28.h(aomx.a(aona.NO_UPSCALE, aomz.BOOLEAN));
        if (treeMap.containsKey("ft")) {
            f29 = (amuf) treeMap.get("ft");
        } else {
            f29 = amuk.f();
            treeMap.put("ft", f29);
        }
        f29.h(aomx.a(aona.FORCE_TRANSFORMATION, aomz.BOOLEAN));
        if (treeMap.containsKey("cc")) {
            f30 = (amuf) treeMap.get("cc");
        } else {
            f30 = amuk.f();
            treeMap.put("cc", f30);
        }
        f30.h(aomx.a(aona.CIRCLE_CROP, aomz.BOOLEAN));
        if (treeMap.containsKey("nd")) {
            f31 = (amuf) treeMap.get("nd");
        } else {
            f31 = amuk.f();
            treeMap.put("nd", f31);
        }
        f31.h(aomx.a(aona.NO_DEFAULT_IMAGE, aomz.BOOLEAN));
        if (treeMap.containsKey("ip")) {
            f32 = (amuf) treeMap.get("ip");
        } else {
            f32 = amuk.f();
            treeMap.put("ip", f32);
        }
        f32.h(aomx.a(aona.INCLUDE_PUBLIC_METADATA, aomz.BOOLEAN));
        if (treeMap.containsKey("nc")) {
            f33 = (amuf) treeMap.get("nc");
        } else {
            f33 = amuk.f();
            treeMap.put("nc", f33);
        }
        f33.h(aomx.a(aona.NO_CORRECT_EXIF_ORIENTATION, aomz.BOOLEAN));
        if (treeMap.containsKey("a")) {
            f34 = (amuf) treeMap.get("a");
        } else {
            f34 = amuk.f();
            treeMap.put("a", f34);
        }
        f34.h(aomx.a(aona.SELECT_FRAME_NUMBER, aomz.INTEGER));
        if (treeMap.containsKey("rj")) {
            f35 = (amuf) treeMap.get("rj");
        } else {
            f35 = amuk.f();
            treeMap.put("rj", f35);
        }
        f35.h(aomx.a(aona.REQUEST_JPEG, aomz.BOOLEAN));
        if (treeMap.containsKey("rp")) {
            f36 = (amuf) treeMap.get("rp");
        } else {
            f36 = amuk.f();
            treeMap.put("rp", f36);
        }
        f36.h(aomx.a(aona.REQUEST_PNG, aomz.BOOLEAN));
        if (treeMap.containsKey("rg")) {
            f37 = (amuf) treeMap.get("rg");
        } else {
            f37 = amuk.f();
            treeMap.put("rg", f37);
        }
        f37.h(aomx.a(aona.REQUEST_GIF, aomz.BOOLEAN));
        if (treeMap.containsKey("pd")) {
            f38 = (amuf) treeMap.get("pd");
        } else {
            f38 = amuk.f();
            treeMap.put("pd", f38);
        }
        f38.h(aomx.a(aona.PAD, aomz.BOOLEAN));
        if (treeMap.containsKey("pa")) {
            f39 = (amuf) treeMap.get("pa");
        } else {
            f39 = amuk.f();
            treeMap.put("pa", f39);
        }
        f39.h(aomx.a(aona.PRESERVE_ASPECT_RATIO, aomz.BOOLEAN));
        if (treeMap.containsKey("m")) {
            f40 = (amuf) treeMap.get("m");
        } else {
            f40 = amuk.f();
            treeMap.put("m", f40);
        }
        f40.h(aomx.a(aona.VIDEO_FORMAT, aomz.INTEGER));
        if (treeMap.containsKey("vb")) {
            f41 = (amuf) treeMap.get("vb");
        } else {
            f41 = amuk.f();
            treeMap.put("vb", f41);
        }
        f41.h(aomx.a(aona.VIDEO_BEGIN, aomz.LONG));
        if (treeMap.containsKey("vl")) {
            f42 = (amuf) treeMap.get("vl");
        } else {
            f42 = amuk.f();
            treeMap.put("vl", f42);
        }
        f42.h(aomx.a(aona.VIDEO_LENGTH, aomz.LONG));
        if (treeMap.containsKey("lf")) {
            f43 = (amuf) treeMap.get("lf");
        } else {
            f43 = amuk.f();
            treeMap.put("lf", f43);
        }
        f43.h(aomx.a(aona.LOOSE_FACE_CROP, aomz.BOOLEAN));
        if (treeMap.containsKey("mv")) {
            f44 = (amuf) treeMap.get("mv");
        } else {
            f44 = amuk.f();
            treeMap.put("mv", f44);
        }
        f44.h(aomx.a(aona.MATCH_VERSION, aomz.BOOLEAN));
        if (treeMap.containsKey("id")) {
            f45 = (amuf) treeMap.get("id");
        } else {
            f45 = amuk.f();
            treeMap.put("id", f45);
        }
        f45.h(aomx.a(aona.IMAGE_DIGEST, aomz.BOOLEAN));
        if (treeMap.containsKey("al")) {
            f46 = (amuf) treeMap.get("al");
        } else {
            f46 = amuk.f();
            treeMap.put("al", f46);
        }
        f46.h(aomx.a(aona.AUTOLOOP, aomz.BOOLEAN));
        if (treeMap.containsKey("ic")) {
            f47 = (amuf) treeMap.get("ic");
        } else {
            f47 = amuk.f();
            treeMap.put("ic", f47);
        }
        f47.h(aomx.a(aona.INTERNAL_CLIENT, aomz.INTEGER));
        if (treeMap.containsKey("pg")) {
            f48 = (amuf) treeMap.get("pg");
        } else {
            f48 = amuk.f();
            treeMap.put("pg", f48);
        }
        f48.h(aomx.a(aona.TILE_PYRAMID_AS_PROTO, aomz.BOOLEAN));
        if (treeMap.containsKey("mo")) {
            f49 = (amuf) treeMap.get("mo");
        } else {
            f49 = amuk.f();
            treeMap.put("mo", f49);
        }
        f49.h(aomx.a(aona.MONOGRAM, aomz.BOOLEAN));
        if (treeMap.containsKey("nt0")) {
            f50 = (amuf) treeMap.get("nt0");
        } else {
            f50 = amuk.f();
            treeMap.put("nt0", f50);
        }
        f50.h(aomx.a(aona.VERSIONED_TOKEN, aomz.STRING));
        if (treeMap.containsKey("iv")) {
            f51 = (amuf) treeMap.get("iv");
        } else {
            f51 = amuk.f();
            treeMap.put("iv", f51);
        }
        f51.h(aomx.a(aona.IMAGE_VERSION, aomz.LONG));
        if (treeMap.containsKey("pi")) {
            f52 = (amuf) treeMap.get("pi");
        } else {
            f52 = amuk.f();
            treeMap.put("pi", f52);
        }
        f52.h(aomx.a(aona.PITCH_DEGREES, aomz.FLOAT));
        if (treeMap.containsKey("ya")) {
            f53 = (amuf) treeMap.get("ya");
        } else {
            f53 = amuk.f();
            treeMap.put("ya", f53);
        }
        f53.h(aomx.a(aona.YAW_DEGREES, aomz.FLOAT));
        if (treeMap.containsKey("ro")) {
            f54 = (amuf) treeMap.get("ro");
        } else {
            f54 = amuk.f();
            treeMap.put("ro", f54);
        }
        f54.h(aomx.a(aona.ROLL_DEGREES, aomz.FLOAT));
        if (treeMap.containsKey("fo")) {
            f55 = (amuf) treeMap.get("fo");
        } else {
            f55 = amuk.f();
            treeMap.put("fo", f55);
        }
        f55.h(aomx.a(aona.FOV_DEGREES, aomz.FLOAT));
        if (treeMap.containsKey("df")) {
            f56 = (amuf) treeMap.get("df");
        } else {
            f56 = amuk.f();
            treeMap.put("df", f56);
        }
        f56.h(aomx.a(aona.DETECT_FACES, aomz.BOOLEAN));
        if (treeMap.containsKey("mm")) {
            f57 = (amuf) treeMap.get("mm");
        } else {
            f57 = amuk.f();
            treeMap.put("mm", f57);
        }
        f57.h(aomx.a(aona.VIDEO_MULTI_FORMAT, aomz.STRING));
        if (treeMap.containsKey("sg")) {
            f58 = (amuf) treeMap.get("sg");
        } else {
            f58 = amuk.f();
            treeMap.put("sg", f58);
        }
        f58.h(aomx.a(aona.STRIP_GOOGLE_DATA, aomz.BOOLEAN));
        if (treeMap.containsKey("gd")) {
            f59 = (amuf) treeMap.get("gd");
        } else {
            f59 = amuk.f();
            treeMap.put("gd", f59);
        }
        f59.h(aomx.a(aona.PRESERVE_GOOGLE_DATA, aomz.BOOLEAN));
        if (treeMap.containsKey("fm")) {
            f60 = (amuf) treeMap.get("fm");
        } else {
            f60 = amuk.f();
            treeMap.put("fm", f60);
        }
        f60.h(aomx.a(aona.FORCE_MONOGRAM, aomz.BOOLEAN));
        if (treeMap.containsKey("ba")) {
            f61 = (amuf) treeMap.get("ba");
        } else {
            f61 = amuk.f();
            treeMap.put("ba", f61);
        }
        f61.h(aomx.a(aona.BADGE, aomz.INTEGER));
        if (treeMap.containsKey("br")) {
            f62 = (amuf) treeMap.get("br");
        } else {
            f62 = amuk.f();
            treeMap.put("br", f62);
        }
        f62.h(aomx.a(aona.BORDER_RADIUS, aomz.INTEGER));
        if (treeMap.containsKey("bc")) {
            f63 = (amuf) treeMap.get("bc");
        } else {
            f63 = amuk.f();
            treeMap.put("bc", f63);
        }
        f63.h(aomx.a(aona.BACKGROUND_COLOR, aomz.PREFIX_HEX));
        if (treeMap.containsKey("pc")) {
            f64 = (amuf) treeMap.get("pc");
        } else {
            f64 = amuk.f();
            treeMap.put("pc", f64);
        }
        f64.h(aomx.a(aona.PAD_COLOR, aomz.PREFIX_HEX));
        if (treeMap.containsKey("sc")) {
            f65 = (amuf) treeMap.get("sc");
        } else {
            f65 = amuk.f();
            treeMap.put("sc", f65);
        }
        f65.h(aomx.a(aona.SUBSTITUTION_COLOR, aomz.PREFIX_HEX));
        if (treeMap.containsKey("dv")) {
            f66 = (amuf) treeMap.get("dv");
        } else {
            f66 = amuk.f();
            treeMap.put("dv", f66);
        }
        f66.h(aomx.a(aona.DOWNLOAD_VIDEO, aomz.BOOLEAN));
        if (treeMap.containsKey("md")) {
            f67 = (amuf) treeMap.get("md");
        } else {
            f67 = amuk.f();
            treeMap.put("md", f67);
        }
        f67.h(aomx.a(aona.MONOGRAM_DOGFOOD, aomz.BOOLEAN));
        if (treeMap.containsKey("cp")) {
            f68 = (amuf) treeMap.get("cp");
        } else {
            f68 = amuk.f();
            treeMap.put("cp", f68);
        }
        f68.h(aomx.a(aona.COLOR_PROFILE, aomz.INTEGER));
        if (treeMap.containsKey("sm")) {
            f69 = (amuf) treeMap.get("sm");
        } else {
            f69 = amuk.f();
            treeMap.put("sm", f69);
        }
        f69.h(aomx.a(aona.STRIP_METADATA, aomz.BOOLEAN));
        if (treeMap.containsKey("cv")) {
            f70 = (amuf) treeMap.get("cv");
        } else {
            f70 = amuk.f();
            treeMap.put("cv", f70);
        }
        f70.h(aomx.a(aona.FACE_CROP_VERSION, aomz.INTEGER));
        if (treeMap.containsKey("ng")) {
            f71 = (amuf) treeMap.get("ng");
        } else {
            f71 = amuk.f();
            treeMap.put("ng", f71);
        }
        f71.h(aomx.a(aona.STRIP_GEOINFO, aomz.BOOLEAN));
        if (treeMap.containsKey("il")) {
            f72 = (amuf) treeMap.get("il");
        } else {
            f72 = amuk.f();
            treeMap.put("il", f72);
        }
        f72.h(aomx.a(aona.IGNORE_LOW_RES_PROFILE_PHOTO, aomz.BOOLEAN));
        if (treeMap.containsKey("lo")) {
            f73 = (amuf) treeMap.get("lo");
        } else {
            f73 = amuk.f();
            treeMap.put("lo", f73);
        }
        f73.h(aomx.a(aona.LOSSY, aomz.BOOLEAN));
        if (treeMap.containsKey("vm")) {
            f74 = (amuf) treeMap.get("vm");
        } else {
            f74 = amuk.f();
            treeMap.put("vm", f74);
        }
        f74.h(aomx.a(aona.VIDEO_MANIFEST, aomz.BOOLEAN));
        if (treeMap.containsKey("dc")) {
            f75 = (amuf) treeMap.get("dc");
        } else {
            f75 = amuk.f();
            treeMap.put("dc", f75);
        }
        f75.h(aomx.a(aona.DEEP_CROP, aomz.FIFE_SAFE_BASE_64));
        if (treeMap.containsKey("rf")) {
            f76 = (amuf) treeMap.get("rf");
        } else {
            f76 = amuk.f();
            treeMap.put("rf", f76);
        }
        f76.h(aomx.a(aona.REQUEST_VIDEO_FAST, aomz.BOOLEAN));
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((String) entry.getKey(), amuk.B(((amuf) entry.getValue()).g()));
        }
        a = Collections.unmodifiableMap(treeMap2);
    }
}
