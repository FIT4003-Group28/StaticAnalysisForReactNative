package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: dsnc  reason: default package */
/* loaded from: classes6.dex */
public final class dsnc {
    public static final Map<String, List<dsnb>> a;

    static {
        dccx F;
        dccx dccxVar;
        dccx F2;
        dccx dccxVar2;
        dccx F3;
        dccx dccxVar3;
        dccx F4;
        dccx F5;
        dccx dccxVar4;
        dccx dccxVar5;
        dccx dccxVar6;
        dccx F6;
        dccx dccxVar7;
        dccx F7;
        dccx dccxVar8;
        dccx dccxVar9;
        dccx dccxVar10;
        dccx dccxVar11;
        dccx dccxVar12;
        dccx dccxVar13;
        dccx dccxVar14;
        dccx dccxVar15;
        dccx F8;
        dccx dccxVar16;
        dccx F9;
        dccx F10;
        dccx F11;
        dccx F12;
        dccx dccxVar17;
        dccx dccxVar18;
        dccx F13;
        dccx F14;
        dccx F15;
        dccx F16;
        dccx F17;
        dccx F18;
        dccx F19;
        dccx F20;
        dccx F21;
        dccx F22;
        dccx F23;
        dccx F24;
        dccx F25;
        dccx dccxVar19;
        dccx F26;
        dccx F27;
        dccx F28;
        dccx F29;
        dccx F30;
        dccx F31;
        dccx F32;
        dccx F33;
        dccx F34;
        dccx F35;
        dccx F36;
        dccx F37;
        dccx F38;
        dccx F39;
        dccx F40;
        dccx F41;
        dccx F42;
        dccx F43;
        dccx F44;
        dccx F45;
        dccx F46;
        dccx F47;
        dccx F48;
        dccx F49;
        dccx F50;
        dccx F51;
        dccx F52;
        dccx F53;
        dccx F54;
        dccx F55;
        dccx F56;
        dccx F57;
        dccx F58;
        dccx F59;
        dccx F60;
        dccx F61;
        dccx F62;
        dccx F63;
        dccx F64;
        dccx F65;
        dccx F66;
        dccx F67;
        dccx F68;
        dccx F69;
        dccx F70;
        dccx F71;
        dccx F72;
        dccx F73;
        dccx F74;
        TreeMap treeMap = new TreeMap();
        if (treeMap.containsKey("s")) {
            F = (dccx) treeMap.get("s");
        } else {
            F = dcdc.F();
            treeMap.put("s", F);
        }
        F.g(dsnb.a(dsne.SIZE, dsnd.INTEGER));
        if (treeMap.containsKey("w")) {
            dccxVar = (dccx) treeMap.get("w");
        } else {
            dccx F75 = dcdc.F();
            treeMap.put("w", F75);
            dccxVar = F75;
        }
        dccxVar.g(dsnb.a(dsne.WIDTH, dsnd.INTEGER));
        if (treeMap.containsKey("c")) {
            F2 = (dccx) treeMap.get("c");
        } else {
            F2 = dcdc.F();
            treeMap.put("c", F2);
        }
        F2.g(dsnb.a(dsne.CROP, dsnd.BOOLEAN));
        if (treeMap.containsKey("d")) {
            dccxVar2 = (dccx) treeMap.get("d");
        } else {
            dccx F76 = dcdc.F();
            treeMap.put("d", F76);
            dccxVar2 = F76;
        }
        dccxVar2.g(dsnb.a(dsne.DOWNLOAD, dsnd.BOOLEAN));
        if (treeMap.containsKey("h")) {
            F3 = (dccx) treeMap.get("h");
        } else {
            F3 = dcdc.F();
            treeMap.put("h", F3);
        }
        F3.g(dsnb.a(dsne.HEIGHT, dsnd.INTEGER));
        if (treeMap.containsKey("s")) {
            dccxVar3 = (dccx) treeMap.get("s");
        } else {
            dccx F77 = dcdc.F();
            treeMap.put("s", F77);
            dccxVar3 = F77;
        }
        dccxVar3.g(dsnb.a(dsne.STRETCH, dsnd.BOOLEAN));
        if (treeMap.containsKey("h")) {
            F4 = (dccx) treeMap.get("h");
        } else {
            F4 = dcdc.F();
            treeMap.put("h", F4);
        }
        F4.g(dsnb.a(dsne.HTML, dsnd.BOOLEAN));
        if (treeMap.containsKey("p")) {
            F5 = (dccx) treeMap.get("p");
        } else {
            F5 = dcdc.F();
            treeMap.put("p", F5);
        }
        F5.g(dsnb.a(dsne.SMART_CROP, dsnd.BOOLEAN));
        if (treeMap.containsKey("pp")) {
            dccxVar4 = (dccx) treeMap.get("pp");
        } else {
            dccx F78 = dcdc.F();
            treeMap.put("pp", F78);
            dccxVar4 = F78;
        }
        dccxVar4.g(dsnb.a(dsne.SMART_CROP_NO_CLIP, dsnd.BOOLEAN));
        if (treeMap.containsKey("pf")) {
            dccxVar5 = (dccx) treeMap.get("pf");
        } else {
            dccx F79 = dcdc.F();
            treeMap.put("pf", F79);
            dccxVar5 = F79;
        }
        dccxVar5.g(dsnb.a(dsne.SMART_CROP_USE_FACE, dsnd.BOOLEAN));
        if (treeMap.containsKey("n")) {
            dccxVar6 = (dccx) treeMap.get("n");
        } else {
            dccx F80 = dcdc.F();
            treeMap.put("n", F80);
            dccxVar6 = F80;
        }
        dccxVar6.g(dsnb.a(dsne.CENTER_CROP, dsnd.BOOLEAN));
        if (treeMap.containsKey("r")) {
            F6 = (dccx) treeMap.get("r");
        } else {
            F6 = dcdc.F();
            treeMap.put("r", F6);
        }
        F6.g(dsnb.a(dsne.ROTATE, dsnd.INTEGER));
        if (treeMap.containsKey("r")) {
            dccxVar7 = (dccx) treeMap.get("r");
        } else {
            dccx F81 = dcdc.F();
            treeMap.put("r", F81);
            dccxVar7 = F81;
        }
        dccxVar7.g(dsnb.a(dsne.SKIP_REFERER_CHECK, dsnd.BOOLEAN));
        if (treeMap.containsKey("o")) {
            F7 = (dccx) treeMap.get("o");
        } else {
            F7 = dcdc.F();
            treeMap.put("o", F7);
        }
        F7.g(dsnb.a(dsne.OVERLAY, dsnd.BOOLEAN));
        if (treeMap.containsKey("o")) {
            dccxVar8 = (dccx) treeMap.get("o");
        } else {
            dccx F82 = dcdc.F();
            treeMap.put("o", F82);
            dccxVar8 = F82;
        }
        dccxVar8.g(dsnb.a(dsne.OBJECT_ID, dsnd.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("j")) {
            dccxVar9 = (dccx) treeMap.get("j");
        } else {
            dccx F83 = dcdc.F();
            treeMap.put("j", F83);
            dccxVar9 = F83;
        }
        dccxVar9.g(dsnb.a(dsne.FRAME_ID, dsnd.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("x")) {
            dccxVar10 = (dccx) treeMap.get("x");
        } else {
            dccx F84 = dcdc.F();
            treeMap.put("x", F84);
            dccxVar10 = F84;
        }
        dccxVar10.g(dsnb.a(dsne.TILE_X, dsnd.INTEGER));
        if (treeMap.containsKey("y")) {
            dccxVar11 = (dccx) treeMap.get("y");
        } else {
            dccx F85 = dcdc.F();
            treeMap.put("y", F85);
            dccxVar11 = F85;
        }
        dccxVar11.g(dsnb.a(dsne.TILE_Y, dsnd.INTEGER));
        if (treeMap.containsKey("z")) {
            dccxVar12 = (dccx) treeMap.get("z");
        } else {
            dccx F86 = dcdc.F();
            treeMap.put("z", F86);
            dccxVar12 = F86;
        }
        dccxVar12.g(dsnb.a(dsne.TILE_ZOOM, dsnd.INTEGER));
        if (treeMap.containsKey("g")) {
            dccxVar13 = (dccx) treeMap.get("g");
        } else {
            dccx F87 = dcdc.F();
            treeMap.put("g", F87);
            dccxVar13 = F87;
        }
        dccxVar13.g(dsnb.a(dsne.TILE_GENERATION, dsnd.BOOLEAN));
        if (treeMap.containsKey("e")) {
            dccxVar14 = (dccx) treeMap.get("e");
        } else {
            dccx F88 = dcdc.F();
            treeMap.put("e", F88);
            dccxVar14 = F88;
        }
        dccxVar14.g(dsnb.a(dsne.EXPIRATION_TIME, dsnd.INTEGER));
        if (treeMap.containsKey("f")) {
            dccxVar15 = (dccx) treeMap.get("f");
        } else {
            dccx F89 = dcdc.F();
            treeMap.put("f", F89);
            dccxVar15 = F89;
        }
        dccxVar15.g(dsnb.a(dsne.IMAGE_FILTER, dsnd.STRING));
        if (treeMap.containsKey("k")) {
            F8 = (dccx) treeMap.get("k");
        } else {
            F8 = dcdc.F();
            treeMap.put("k", F8);
        }
        F8.g(dsnb.a(dsne.KILL_ANIMATION, dsnd.BOOLEAN));
        if (treeMap.containsKey("u")) {
            dccxVar16 = (dccx) treeMap.get("u");
        } else {
            dccx F90 = dcdc.F();
            treeMap.put("u", F90);
            dccxVar16 = F90;
        }
        dccxVar16.g(dsnb.a(dsne.UNFILTERED, dsnd.BOOLEAN));
        if (treeMap.containsKey("ut")) {
            F9 = (dccx) treeMap.get("ut");
        } else {
            F9 = dcdc.F();
            treeMap.put("ut", F9);
        }
        F9.g(dsnb.a(dsne.UNFILTERED_WITH_TRANSFORMS, dsnd.BOOLEAN));
        if (treeMap.containsKey("i")) {
            F10 = (dccx) treeMap.get("i");
        } else {
            F10 = dcdc.F();
            treeMap.put("i", F10);
        }
        F10.g(dsnb.a(dsne.INCLUDE_METADATA, dsnd.BOOLEAN));
        if (treeMap.containsKey("a")) {
            F11 = (dccx) treeMap.get("a");
        } else {
            F11 = dcdc.F();
            treeMap.put("a", F11);
        }
        F11.g(dsnb.a(dsne.ES_PORTRAIT_APPROVED_ONLY, dsnd.BOOLEAN));
        if (treeMap.containsKey("b")) {
            F12 = (dccx) treeMap.get("b");
        } else {
            F12 = dcdc.F();
            treeMap.put("b", F12);
        }
        F12.g(dsnb.a(dsne.BYPASS_TAKEDOWN, dsnd.BOOLEAN));
        if (treeMap.containsKey("b")) {
            dccxVar17 = (dccx) treeMap.get("b");
        } else {
            dccx F91 = dcdc.F();
            treeMap.put("b", F91);
            dccxVar17 = F91;
        }
        dccxVar17.g(dsnb.a(dsne.BORDER_SIZE, dsnd.INTEGER));
        if (treeMap.containsKey("c")) {
            dccxVar18 = (dccx) treeMap.get("c");
        } else {
            dccx F92 = dcdc.F();
            treeMap.put("c", F92);
            dccxVar18 = F92;
        }
        dccxVar18.g(dsnb.a(dsne.BORDER_COLOR, dsnd.PREFIX_HEX));
        if (treeMap.containsKey("q")) {
            F13 = (dccx) treeMap.get("q");
        } else {
            F13 = dcdc.F();
            treeMap.put("q", F13);
        }
        F13.g(dsnb.a(dsne.QUERY_STRING, dsnd.STRING));
        if (treeMap.containsKey("fh")) {
            F14 = (dccx) treeMap.get("fh");
        } else {
            F14 = dcdc.F();
            treeMap.put("fh", F14);
        }
        F14.g(dsnb.a(dsne.HORIZONTAL_FLIP, dsnd.BOOLEAN));
        if (treeMap.containsKey("fv")) {
            F15 = (dccx) treeMap.get("fv");
        } else {
            F15 = dcdc.F();
            treeMap.put("fv", F15);
        }
        F15.g(dsnb.a(dsne.VERTICAL_FLIP, dsnd.BOOLEAN));
        if (treeMap.containsKey("fg")) {
            F16 = (dccx) treeMap.get("fg");
        } else {
            F16 = dcdc.F();
            treeMap.put("fg", F16);
        }
        F16.g(dsnb.a(dsne.FORCE_TILE_GENERATION, dsnd.BOOLEAN));
        if (treeMap.containsKey("ci")) {
            F17 = (dccx) treeMap.get("ci");
        } else {
            F17 = dcdc.F();
            treeMap.put("ci", F17);
        }
        F17.g(dsnb.a(dsne.IMAGE_CROP, dsnd.BOOLEAN));
        if (treeMap.containsKey("rw")) {
            F18 = (dccx) treeMap.get("rw");
        } else {
            F18 = dcdc.F();
            treeMap.put("rw", F18);
        }
        F18.g(dsnb.a(dsne.REQUEST_WEBP, dsnd.BOOLEAN));
        if (treeMap.containsKey("rwu")) {
            F19 = (dccx) treeMap.get("rwu");
        } else {
            F19 = dcdc.F();
            treeMap.put("rwu", F19);
        }
        F19.g(dsnb.a(dsne.REQUEST_WEBP_UNLESS_MAYBE_TRANSPARENT, dsnd.BOOLEAN));
        if (treeMap.containsKey("rwa")) {
            F20 = (dccx) treeMap.get("rwa");
        } else {
            F20 = dcdc.F();
            treeMap.put("rwa", F20);
        }
        F20.g(dsnb.a(dsne.REQUEST_ANIMATED_WEBP, dsnd.BOOLEAN));
        if (treeMap.containsKey("nw")) {
            F21 = (dccx) treeMap.get("nw");
        } else {
            F21 = dcdc.F();
            treeMap.put("nw", F21);
        }
        F21.g(dsnb.a(dsne.NO_WEBP, dsnd.BOOLEAN));
        if (treeMap.containsKey("rh")) {
            F22 = (dccx) treeMap.get("rh");
        } else {
            F22 = dcdc.F();
            treeMap.put("rh", F22);
        }
        F22.g(dsnb.a(dsne.REQUEST_H264, dsnd.BOOLEAN));
        if (treeMap.containsKey("no")) {
            F23 = (dccx) treeMap.get("no");
        } else {
            F23 = dcdc.F();
            treeMap.put("no", F23);
        }
        F23.g(dsnb.a(dsne.NO_OVERLAY, dsnd.BOOLEAN));
        if (treeMap.containsKey("ns")) {
            F24 = (dccx) treeMap.get("ns");
        } else {
            F24 = dcdc.F();
            treeMap.put("ns", F24);
        }
        F24.g(dsnb.a(dsne.NO_SILHOUETTE, dsnd.BOOLEAN));
        if (treeMap.containsKey("k")) {
            F25 = (dccx) treeMap.get("k");
        } else {
            F25 = dcdc.F();
            treeMap.put("k", F25);
        }
        F25.g(dsnb.a(dsne.FOCUS_BLUR, dsnd.INTEGER));
        if (treeMap.containsKey("p")) {
            dccxVar19 = (dccx) treeMap.get("p");
        } else {
            dccx F93 = dcdc.F();
            treeMap.put("p", F93);
            dccxVar19 = F93;
        }
        dccxVar19.g(dsnb.a(dsne.FOCAL_PLANE, dsnd.INTEGER));
        if (treeMap.containsKey("l")) {
            F26 = (dccx) treeMap.get("l");
        } else {
            F26 = dcdc.F();
            treeMap.put("l", F26);
        }
        F26.g(dsnb.a(dsne.QUALITY_LEVEL, dsnd.INTEGER));
        if (treeMap.containsKey("v")) {
            F27 = (dccx) treeMap.get("v");
        } else {
            F27 = dcdc.F();
            treeMap.put("v", F27);
        }
        F27.g(dsnb.a(dsne.QUALITY_BUCKET, dsnd.INTEGER));
        if (treeMap.containsKey("nu")) {
            F28 = (dccx) treeMap.get("nu");
        } else {
            F28 = dcdc.F();
            treeMap.put("nu", F28);
        }
        F28.g(dsnb.a(dsne.NO_UPSCALE, dsnd.BOOLEAN));
        if (treeMap.containsKey("ft")) {
            F29 = (dccx) treeMap.get("ft");
        } else {
            F29 = dcdc.F();
            treeMap.put("ft", F29);
        }
        F29.g(dsnb.a(dsne.FORCE_TRANSFORMATION, dsnd.BOOLEAN));
        if (treeMap.containsKey("cc")) {
            F30 = (dccx) treeMap.get("cc");
        } else {
            F30 = dcdc.F();
            treeMap.put("cc", F30);
        }
        F30.g(dsnb.a(dsne.CIRCLE_CROP, dsnd.BOOLEAN));
        if (treeMap.containsKey("nd")) {
            F31 = (dccx) treeMap.get("nd");
        } else {
            F31 = dcdc.F();
            treeMap.put("nd", F31);
        }
        F31.g(dsnb.a(dsne.NO_DEFAULT_IMAGE, dsnd.BOOLEAN));
        if (treeMap.containsKey("ip")) {
            F32 = (dccx) treeMap.get("ip");
        } else {
            F32 = dcdc.F();
            treeMap.put("ip", F32);
        }
        F32.g(dsnb.a(dsne.INCLUDE_PUBLIC_METADATA, dsnd.BOOLEAN));
        if (treeMap.containsKey("nc")) {
            F33 = (dccx) treeMap.get("nc");
        } else {
            F33 = dcdc.F();
            treeMap.put("nc", F33);
        }
        F33.g(dsnb.a(dsne.NO_CORRECT_EXIF_ORIENTATION, dsnd.BOOLEAN));
        if (treeMap.containsKey("a")) {
            F34 = (dccx) treeMap.get("a");
        } else {
            F34 = dcdc.F();
            treeMap.put("a", F34);
        }
        F34.g(dsnb.a(dsne.SELECT_FRAME_NUMBER, dsnd.INTEGER));
        if (treeMap.containsKey("rj")) {
            F35 = (dccx) treeMap.get("rj");
        } else {
            F35 = dcdc.F();
            treeMap.put("rj", F35);
        }
        F35.g(dsnb.a(dsne.REQUEST_JPEG, dsnd.BOOLEAN));
        if (treeMap.containsKey("rp")) {
            F36 = (dccx) treeMap.get("rp");
        } else {
            F36 = dcdc.F();
            treeMap.put("rp", F36);
        }
        F36.g(dsnb.a(dsne.REQUEST_PNG, dsnd.BOOLEAN));
        if (treeMap.containsKey("rg")) {
            F37 = (dccx) treeMap.get("rg");
        } else {
            F37 = dcdc.F();
            treeMap.put("rg", F37);
        }
        F37.g(dsnb.a(dsne.REQUEST_GIF, dsnd.BOOLEAN));
        if (treeMap.containsKey("pd")) {
            F38 = (dccx) treeMap.get("pd");
        } else {
            F38 = dcdc.F();
            treeMap.put("pd", F38);
        }
        F38.g(dsnb.a(dsne.PAD, dsnd.BOOLEAN));
        if (treeMap.containsKey("pa")) {
            F39 = (dccx) treeMap.get("pa");
        } else {
            F39 = dcdc.F();
            treeMap.put("pa", F39);
        }
        F39.g(dsnb.a(dsne.PRESERVE_ASPECT_RATIO, dsnd.BOOLEAN));
        if (treeMap.containsKey("m")) {
            F40 = (dccx) treeMap.get("m");
        } else {
            F40 = dcdc.F();
            treeMap.put("m", F40);
        }
        F40.g(dsnb.a(dsne.VIDEO_FORMAT, dsnd.INTEGER));
        if (treeMap.containsKey("vb")) {
            F41 = (dccx) treeMap.get("vb");
        } else {
            F41 = dcdc.F();
            treeMap.put("vb", F41);
        }
        F41.g(dsnb.a(dsne.VIDEO_BEGIN, dsnd.LONG));
        if (treeMap.containsKey("vl")) {
            F42 = (dccx) treeMap.get("vl");
        } else {
            F42 = dcdc.F();
            treeMap.put("vl", F42);
        }
        F42.g(dsnb.a(dsne.VIDEO_LENGTH, dsnd.LONG));
        if (treeMap.containsKey("lf")) {
            F43 = (dccx) treeMap.get("lf");
        } else {
            F43 = dcdc.F();
            treeMap.put("lf", F43);
        }
        F43.g(dsnb.a(dsne.LOOSE_FACE_CROP, dsnd.BOOLEAN));
        if (treeMap.containsKey("mv")) {
            F44 = (dccx) treeMap.get("mv");
        } else {
            F44 = dcdc.F();
            treeMap.put("mv", F44);
        }
        F44.g(dsnb.a(dsne.MATCH_VERSION, dsnd.BOOLEAN));
        if (treeMap.containsKey("id")) {
            F45 = (dccx) treeMap.get("id");
        } else {
            F45 = dcdc.F();
            treeMap.put("id", F45);
        }
        F45.g(dsnb.a(dsne.IMAGE_DIGEST, dsnd.BOOLEAN));
        if (treeMap.containsKey("al")) {
            F46 = (dccx) treeMap.get("al");
        } else {
            F46 = dcdc.F();
            treeMap.put("al", F46);
        }
        F46.g(dsnb.a(dsne.AUTOLOOP, dsnd.BOOLEAN));
        if (treeMap.containsKey("ic")) {
            F47 = (dccx) treeMap.get("ic");
        } else {
            F47 = dcdc.F();
            treeMap.put("ic", F47);
        }
        F47.g(dsnb.a(dsne.INTERNAL_CLIENT, dsnd.INTEGER));
        if (treeMap.containsKey("pg")) {
            F48 = (dccx) treeMap.get("pg");
        } else {
            F48 = dcdc.F();
            treeMap.put("pg", F48);
        }
        F48.g(dsnb.a(dsne.TILE_PYRAMID_AS_PROTO, dsnd.BOOLEAN));
        if (treeMap.containsKey("mo")) {
            F49 = (dccx) treeMap.get("mo");
        } else {
            F49 = dcdc.F();
            treeMap.put("mo", F49);
        }
        F49.g(dsnb.a(dsne.MONOGRAM, dsnd.BOOLEAN));
        if (treeMap.containsKey("nt0")) {
            F50 = (dccx) treeMap.get("nt0");
        } else {
            F50 = dcdc.F();
            treeMap.put("nt0", F50);
        }
        F50.g(dsnb.a(dsne.VERSIONED_TOKEN, dsnd.STRING));
        if (treeMap.containsKey("iv")) {
            F51 = (dccx) treeMap.get("iv");
        } else {
            F51 = dcdc.F();
            treeMap.put("iv", F51);
        }
        F51.g(dsnb.a(dsne.IMAGE_VERSION, dsnd.LONG));
        if (treeMap.containsKey("pi")) {
            F52 = (dccx) treeMap.get("pi");
        } else {
            F52 = dcdc.F();
            treeMap.put("pi", F52);
        }
        F52.g(dsnb.a(dsne.PITCH_DEGREES, dsnd.FLOAT));
        if (treeMap.containsKey("ya")) {
            F53 = (dccx) treeMap.get("ya");
        } else {
            F53 = dcdc.F();
            treeMap.put("ya", F53);
        }
        F53.g(dsnb.a(dsne.YAW_DEGREES, dsnd.FLOAT));
        if (treeMap.containsKey("ro")) {
            F54 = (dccx) treeMap.get("ro");
        } else {
            F54 = dcdc.F();
            treeMap.put("ro", F54);
        }
        F54.g(dsnb.a(dsne.ROLL_DEGREES, dsnd.FLOAT));
        if (treeMap.containsKey("fo")) {
            F55 = (dccx) treeMap.get("fo");
        } else {
            F55 = dcdc.F();
            treeMap.put("fo", F55);
        }
        F55.g(dsnb.a(dsne.FOV_DEGREES, dsnd.FLOAT));
        if (treeMap.containsKey("df")) {
            F56 = (dccx) treeMap.get("df");
        } else {
            F56 = dcdc.F();
            treeMap.put("df", F56);
        }
        F56.g(dsnb.a(dsne.DETECT_FACES, dsnd.BOOLEAN));
        if (treeMap.containsKey("mm")) {
            F57 = (dccx) treeMap.get("mm");
        } else {
            F57 = dcdc.F();
            treeMap.put("mm", F57);
        }
        F57.g(dsnb.a(dsne.VIDEO_MULTI_FORMAT, dsnd.STRING));
        if (treeMap.containsKey("sg")) {
            F58 = (dccx) treeMap.get("sg");
        } else {
            F58 = dcdc.F();
            treeMap.put("sg", F58);
        }
        F58.g(dsnb.a(dsne.STRIP_GOOGLE_DATA, dsnd.BOOLEAN));
        if (treeMap.containsKey("gd")) {
            F59 = (dccx) treeMap.get("gd");
        } else {
            F59 = dcdc.F();
            treeMap.put("gd", F59);
        }
        F59.g(dsnb.a(dsne.PRESERVE_GOOGLE_DATA, dsnd.BOOLEAN));
        if (treeMap.containsKey("fm")) {
            F60 = (dccx) treeMap.get("fm");
        } else {
            F60 = dcdc.F();
            treeMap.put("fm", F60);
        }
        F60.g(dsnb.a(dsne.FORCE_MONOGRAM, dsnd.BOOLEAN));
        if (treeMap.containsKey("ba")) {
            F61 = (dccx) treeMap.get("ba");
        } else {
            F61 = dcdc.F();
            treeMap.put("ba", F61);
        }
        F61.g(dsnb.a(dsne.BADGE, dsnd.INTEGER));
        if (treeMap.containsKey("br")) {
            F62 = (dccx) treeMap.get("br");
        } else {
            F62 = dcdc.F();
            treeMap.put("br", F62);
        }
        F62.g(dsnb.a(dsne.BORDER_RADIUS, dsnd.INTEGER));
        if (treeMap.containsKey("bc")) {
            F63 = (dccx) treeMap.get("bc");
        } else {
            F63 = dcdc.F();
            treeMap.put("bc", F63);
        }
        F63.g(dsnb.a(dsne.BACKGROUND_COLOR, dsnd.PREFIX_HEX));
        if (treeMap.containsKey("pc")) {
            F64 = (dccx) treeMap.get("pc");
        } else {
            F64 = dcdc.F();
            treeMap.put("pc", F64);
        }
        F64.g(dsnb.a(dsne.PAD_COLOR, dsnd.PREFIX_HEX));
        if (treeMap.containsKey("sc")) {
            F65 = (dccx) treeMap.get("sc");
        } else {
            F65 = dcdc.F();
            treeMap.put("sc", F65);
        }
        F65.g(dsnb.a(dsne.SUBSTITUTION_COLOR, dsnd.PREFIX_HEX));
        if (treeMap.containsKey("dv")) {
            F66 = (dccx) treeMap.get("dv");
        } else {
            F66 = dcdc.F();
            treeMap.put("dv", F66);
        }
        F66.g(dsnb.a(dsne.DOWNLOAD_VIDEO, dsnd.BOOLEAN));
        if (treeMap.containsKey("md")) {
            F67 = (dccx) treeMap.get("md");
        } else {
            F67 = dcdc.F();
            treeMap.put("md", F67);
        }
        F67.g(dsnb.a(dsne.MONOGRAM_DOGFOOD, dsnd.BOOLEAN));
        if (treeMap.containsKey("cp")) {
            F68 = (dccx) treeMap.get("cp");
        } else {
            F68 = dcdc.F();
            treeMap.put("cp", F68);
        }
        F68.g(dsnb.a(dsne.COLOR_PROFILE, dsnd.INTEGER));
        if (treeMap.containsKey("sm")) {
            F69 = (dccx) treeMap.get("sm");
        } else {
            F69 = dcdc.F();
            treeMap.put("sm", F69);
        }
        F69.g(dsnb.a(dsne.STRIP_METADATA, dsnd.BOOLEAN));
        if (treeMap.containsKey("cv")) {
            F70 = (dccx) treeMap.get("cv");
        } else {
            F70 = dcdc.F();
            treeMap.put("cv", F70);
        }
        F70.g(dsnb.a(dsne.FACE_CROP_VERSION, dsnd.INTEGER));
        if (treeMap.containsKey("ng")) {
            F71 = (dccx) treeMap.get("ng");
        } else {
            F71 = dcdc.F();
            treeMap.put("ng", F71);
        }
        F71.g(dsnb.a(dsne.STRIP_GEOINFO, dsnd.BOOLEAN));
        if (treeMap.containsKey("il")) {
            F72 = (dccx) treeMap.get("il");
        } else {
            F72 = dcdc.F();
            treeMap.put("il", F72);
        }
        F72.g(dsnb.a(dsne.IGNORE_LOW_RES_PROFILE_PHOTO, dsnd.BOOLEAN));
        if (treeMap.containsKey("lo")) {
            F73 = (dccx) treeMap.get("lo");
        } else {
            F73 = dcdc.F();
            treeMap.put("lo", F73);
        }
        F73.g(dsnb.a(dsne.LOSSY, dsnd.BOOLEAN));
        if (treeMap.containsKey("vm")) {
            F74 = (dccx) treeMap.get("vm");
        } else {
            F74 = dcdc.F();
            treeMap.put("vm", F74);
        }
        F74.g(dsnb.a(dsne.VIDEO_MANIFEST, dsnd.BOOLEAN));
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((String) entry.getKey(), dcdc.u(((dccx) entry.getValue()).f()));
        }
        a = Collections.unmodifiableMap(treeMap2);
    }
}
